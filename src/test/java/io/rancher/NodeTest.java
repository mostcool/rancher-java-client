package io.rancher;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.rancher.base.TypeCollection;
import io.rancher.service.NodeService;
import io.rancher.type.Node;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.util.List;

import static io.rancher.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NodeTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void listNode() throws Exception {
        Client client = ClientUtils.build(RANCHER_API, ACCESS_KEY, SECRET_KEY).getClient();
        NodeService nodeService = client.type(NodeService.class);

        Response<TypeCollection<Node>> response = nodeService.list().execute();
        System.out.println(response);

        List<Node> nodes = response.body().getData();
        System.out.println(objectMapper.writeValueAsString(nodes));

        assertNotNull(nodes);
    }
}
