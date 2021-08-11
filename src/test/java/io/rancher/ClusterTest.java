package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.base.TypeCollection;
import io.rancher.service.ClusterService;
import io.rancher.type.Cluster;
import okhttp3.ResponseBody;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClusterTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void createCluster() throws Exception {
        Client client = ClientUtils.build(RANCHER_API, ACCESS_KEY, SECRET_KEY).getClient();
        ClusterService clusterService = client.type(ClusterService.class);

        Cluster cluster = new Cluster();
        cluster.setName("gk-" + System.currentTimeMillis());

        Response<Cluster> response = clusterService.create(cluster).execute();
        //System.out.println(response);

        cluster = response.body();
        System.out.println(objectMapper.writeValueAsString(cluster));

        assertTrue(cluster.getId() != null);
    }

    @Test
    void listClusters() throws Exception {
        Client client = ClientUtils.build(RANCHER_API, ACCESS_KEY, SECRET_KEY).getClient();
        ClusterService clusterService = client.type(ClusterService.class);

        Response<TypeCollection<Cluster>> response = clusterService.list().execute();
        //System.out.println(response);

        TypeCollection<Cluster> clusters = response.body();
        System.out.println(objectMapper.writeValueAsString(clusters));

        assertNotNull(clusters);
    }

    @Test
    void deleteCluster() throws Exception {
        Client client = ClientUtils.build(RANCHER_API, ACCESS_KEY, SECRET_KEY).getClient();
        ClusterService clusterService = client.type(ClusterService.class);

        Response<ResponseBody> response = clusterService.delete("c-2qxt8").execute();
        System.out.println(response);

        ResponseBody body = response.body();
        System.out.println(body.string());

        assertNotNull(body.string());
    }
}
