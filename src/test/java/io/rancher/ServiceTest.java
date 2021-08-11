package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.base.TypeCollection;
import io.rancher.service.project.ServiceService;
import io.rancher.type.project.Service;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.List;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ServiceTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void listService() throws Exception {
        Client client = ClientUtils.build(String.format("%sproject/%s:%s/", RANCHER_API, CLUSTERID, PROJECTID), ACCESS_KEY, SECRET_KEY).getClient();
        ServiceService serviceService = client.type(ServiceService.class);

        Response<TypeCollection<Service>> response = serviceService.list().execute();
        System.out.println(response);

        List<Service> services = response.body().getData();
        System.out.println(objectMapper.writeValueAsString(services));

        assertNotNull(services);
    }
}
