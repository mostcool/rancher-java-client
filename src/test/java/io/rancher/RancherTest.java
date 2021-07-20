package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.RancherClient.Config;
import io.rancher.service.ProjectRoleTemplateBindingService;
import io.rancher.service.ProjectService;
import io.rancher.service.project.WorkloadService;
import io.rancher.type.Project;
import io.rancher.type.ProjectRoleTemplateBinding;
import io.rancher.type.project.Container;
import io.rancher.type.project.DeploymentConfig;
import io.rancher.type.project.Workload;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Rancher Client 测试类
 */
public class RancherTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 创建项目
     */
    @Test
    void createProject() throws Exception {
        Project project = new Project();
        project.setClusterId("c-v2brj");
        project.setName("gk-" + System.currentTimeMillis());

        Config config = new Config(
                new URL("https://cloud-dev.xxx.com/v3/"),
                "token-b5tdf",
                "v9nfm9656ggr4tw9rgzvrsrr2b8s8lm5zb8vvpnx6tmfcbstnwrnzg"
        );

        RancherUtils rancherUtils = RancherUtils.buildUtils(config);
        ProjectService projectService = rancherUtils.getClient().type(ProjectService.class);

        Response<Project> expectedResponse = projectService.create(project).execute();
        //System.out.println(expectedResponse);

        project = expectedResponse.body();
        //System.out.println(objectMapper.writeValueAsString(project));

        assertTrue(project.getId() != null);
    }

    /**
     * 部署工作负载
     */
    @Test
    void deployWorkload() throws Exception {
        String clusterId = "c-v2brj";
        String projectId = "p-bj9ps";

        DeploymentConfig deploymentConfig = new DeploymentConfig();
        deploymentConfig.setMinReadySeconds(0);
        deploymentConfig.setRevisionHistoryLimit(10);
        deploymentConfig.setStrategy("RollingUpdate");
        deploymentConfig.setMaxSurge(1);
        deploymentConfig.setMaxUnavailable(0);

        Container container = new Container();
        container.setName("gk111");
        container.setImage("k34176470/gklogtest:latest");

        List<Container> containers = new ArrayList<>();
        containers.add(container);

        Workload workload = new Workload();
        workload.setName("gk111");
        workload.setNamespaceId("logtest");
        workload.setContainers(containers);
        workload.setDeploymentConfig(deploymentConfig);

        Config config = new Config(
                new URL("https://cloud-dev.xxx.com/v3/projects/" + clusterId + ":" + projectId + "/"),
                "token-b5tdf",
                "v9nfm9656ggr4tw9rgzvrsrr2b8s8lm5zb8vvpnx6tmfcbstnwrnzg"
        );

        RancherUtils rancherUtils = RancherUtils.buildUtils(config);
        WorkloadService workloadService = rancherUtils.getClient().type(WorkloadService.class);

        Response<Workload> workloadResponse = workloadService.create(workload).execute();
        System.out.println(workloadResponse);

        workload = workloadResponse.body();
        System.out.println(objectMapper.writeValueAsString(workload));

        assertTrue(workload.getId() != null);
    }

    /**
     * 添加项目用户
     */
    @Test
    void addUser() throws Exception {
        String clusterId = "c-v2brj";
        String projectId = "p-bj9ps";

        ProjectRoleTemplateBinding projectRoleTemplateBinding = new ProjectRoleTemplateBinding();
        projectRoleTemplateBinding.setProjectId(clusterId + ":" + projectId);
        projectRoleTemplateBinding.setUserId("u-fkm7q");
        projectRoleTemplateBinding.setRoleTemplateId("project-member");

        Config config = new Config(
                new URL("https://cloud-dev.xxx.com/v3/"),
                "token-b5tdf",
                "v9nfm9656ggr4tw9rgzvrsrr2b8s8lm5zb8vvpnx6tmfcbstnwrnzg"
        );

        RancherUtils rancherUtils = RancherUtils.buildUtils(config);
        ProjectRoleTemplateBindingService projectRoleTemplateBindingService = rancherUtils.getClient().type(ProjectRoleTemplateBindingService.class);

        Response<ProjectRoleTemplateBinding> projectRoleTemplateBindingResponse = projectRoleTemplateBindingService.create(projectRoleTemplateBinding).execute();
        System.out.println(projectRoleTemplateBindingResponse);

        projectRoleTemplateBinding = projectRoleTemplateBindingResponse.body();
        System.out.println(objectMapper.writeValueAsString(projectRoleTemplateBinding));

        assertTrue(projectRoleTemplateBinding.getId() != null);
    }
}
