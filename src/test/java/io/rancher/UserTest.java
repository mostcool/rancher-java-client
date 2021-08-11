package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.service.ProjectRoleTemplateBindingService;
import io.rancher.type.ProjectRoleTemplateBinding;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void addUser() throws Exception {
        Client client = ClientUtils.build(RANCHER_API, ACCESS_KEY, SECRET_KEY).getClient();
        ProjectRoleTemplateBindingService projectRoleTemplateBindingService = client.type(ProjectRoleTemplateBindingService.class);

        ProjectRoleTemplateBinding projectRoleTemplateBinding = new ProjectRoleTemplateBinding();
        projectRoleTemplateBinding.setProjectId(String.format("%s:%s", CLUSTERID, PROJECTID));
        projectRoleTemplateBinding.setUserId("u-fkm7q");
        projectRoleTemplateBinding.setRoleTemplateId("project-member");

        Response<ProjectRoleTemplateBinding> response = projectRoleTemplateBindingService.create(projectRoleTemplateBinding).execute();
        System.out.println(response);

        projectRoleTemplateBinding = response.body();
        System.out.println(objectMapper.writeValueAsString(projectRoleTemplateBinding));

        assertTrue(projectRoleTemplateBinding.getId() != null);
    }
}
