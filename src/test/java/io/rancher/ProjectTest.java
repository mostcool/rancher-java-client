package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.service.ProjectService;
import io.rancher.type.Project;
import okhttp3.ResponseBody;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.List;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjectTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void createProject() throws Exception {
        Client client = ClientUtils.build(RANCHER_API, ACCESS_KEY, SECRET_KEY).getClient();
        ProjectService projectService = client.type(ProjectService.class);

        Project project = new Project();
        project.setClusterId(CLUSTERID);
        project.setName("gk-" + System.currentTimeMillis());

        Response<Project> response = projectService.create(project).execute();
        //System.out.println(response);

        project = response.body();
        System.out.println(objectMapper.writeValueAsString(project));

        assertTrue(project.getId() != null);
    }

    @Test
    void listProject() throws Exception {
        Client client = ClientUtils.build(RANCHER_API, ACCESS_KEY, SECRET_KEY).getClient();
        ProjectService projectService = client.type(ProjectService.class);

        Filters filters = new Filters();
        filters.put("clusterId", CLUSTERID);

        Response<TypeCollection<Project>> response = projectService.list(filters).execute();
        System.out.println(response);

        List<Project> projects = response.body().getData();
        System.out.println(objectMapper.writeValueAsString(projects));

        assertNotNull(projects);
    }

    @Test
    void deleteProject() throws Exception {
        Client client = ClientUtils.build(RANCHER_API, ACCESS_KEY, SECRET_KEY).getClient();
        ProjectService projectService = client.type(ProjectService.class);

        Response<ResponseBody> response = projectService.delete(String.format("%s:%s", CLUSTERID, PROJECTID)).execute();
        System.out.println(response);

        assertTrue(response.isSuccessful());
    }
}
