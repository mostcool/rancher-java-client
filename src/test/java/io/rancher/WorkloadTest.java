package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.base.TypeCollection;
import io.rancher.service.project.WorkloadService;
import io.rancher.type.project.Container;
import io.rancher.type.project.DeploymentConfig;
import io.rancher.type.project.Workload;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WorkloadTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void listWorkload() throws Exception {
        Client client = ClientUtils.build(String.format("%sproject/%s:%s/", RANCHER_API, CLUSTERID, PROJECTID), ACCESS_KEY, SECRET_KEY).getClient();
        WorkloadService workloadService = client.type(WorkloadService.class);

        Response<TypeCollection<Workload>> response = workloadService.list().execute();
        System.out.println(response);

        List<Workload> workloads = response.body().getData();
        System.out.println(objectMapper.writeValueAsString(workloads));

        assertNotNull(workloads);
    }

    @Test
    void deployWorkload() throws Exception {
        Client client = ClientUtils.build(String.format("%sprojects/%s:%s/", RANCHER_API, CLUSTERID, PROJECTID), ACCESS_KEY, SECRET_KEY).getClient();
        WorkloadService workloadService = client.type(WorkloadService.class);

        DeploymentConfig deploymentConfig = new DeploymentConfig();
        deploymentConfig.setMinReadySeconds(0);
        deploymentConfig.setRevisionHistoryLimit(10);
        deploymentConfig.setStrategy("RollingUpdate");
        deploymentConfig.setMaxSurge("1");
        deploymentConfig.setMaxUnavailable("0");

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

        Response<Workload> response = workloadService.create(workload).execute();
        System.out.println(response);

        workload = response.body();
        System.out.println(objectMapper.writeValueAsString(workload));

        assertTrue(workload.getId() != null);
    }
}
