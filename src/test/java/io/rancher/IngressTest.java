package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.base.TypeCollection;
import io.rancher.service.project.IngressService;
import io.rancher.type.project.Ingress;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.List;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IngressTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void listIngress() throws Exception {
        Client client = ClientUtils.build(String.format("%sproject/%s:%s/", RANCHER_API, CLUSTERID, PROJECTID), ACCESS_KEY, SECRET_KEY).getClient();
        IngressService ingressService = client.type(IngressService.class);

        Response<TypeCollection<Ingress>> response = ingressService.list().execute();
        System.out.println(response);

        List<Ingress> ingresses = response.body().getData();
        System.out.println(objectMapper.writeValueAsString(ingresses));

        assertNotNull(ingresses);
    }
}
