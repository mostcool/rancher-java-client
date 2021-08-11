package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.service.cluster.NamespaceService;
import io.rancher.type.cluster.Namespace;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.List;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NamespaceTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void listNamespace() throws Exception {
        Client client = ClientUtils.build(String.format("%sclusters/%s/", RANCHER_API, CLUSTERID), ACCESS_KEY, SECRET_KEY).getClient();
        NamespaceService namespaceService = client.type(NamespaceService.class);

        Filters filters = new Filters();
        filters.put("projectId", String.format("%s:%s", CLUSTERID, PROJECTID));

        Response<TypeCollection<Namespace>> response = namespaceService.list(filters).execute();
        System.out.println(response);

        List<Namespace> namespaces = response.body().getData();
        System.out.println(objectMapper.writeValueAsString(namespaces));

        assertNotNull(namespaces);
    }

    @Test
    void createNamespace() throws Exception {
        Client client = ClientUtils.build(String.format("%s/clusters/%s/", RANCHER_API, CLUSTERID), ACCESS_KEY, SECRET_KEY).getClient();
        NamespaceService namespaceService = client.type(NamespaceService.class);

        Namespace namespace = new Namespace();
        namespace.setProjectId(String.format("%s:%s", CLUSTERID, PROJECTID));
        namespace.setName("gk-" + System.currentTimeMillis());

        Response<Namespace> response = namespaceService.create(namespace).execute();
        System.out.println(response);

        namespace = response.body();

        assertTrue(namespace.getId() != null);
    }
}
