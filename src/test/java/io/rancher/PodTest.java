package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.base.TypeCollection;
import io.rancher.service.project.PodService;
import io.rancher.type.project.Pod;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.List;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PodTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void listPod() throws Exception {
        Client client = ClientUtils.build(String.format("%sproject/%s:%s/", RANCHER_API, CLUSTERID, PROJECTID), ACCESS_KEY, SECRET_KEY).getClient();
        PodService podService = client.type(PodService.class);

        Response<TypeCollection<Pod>> response = podService.list().execute();
        System.out.println(response);

        List<Pod> pods = response.body().getData();
        System.out.println(objectMapper.writeValueAsString(pods));

        assertNotNull(pods);
    }
}
