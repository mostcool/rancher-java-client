package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PublicEndpoint extends AbstractType {

    @JsonProperty("addresses")
    private List<String> addresses;

    @JsonProperty("allNodes")
    private Boolean allNodes;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("ingressId")
    private String ingressId;

    @JsonProperty("nodeId")
    private String nodeId;

    @JsonProperty("path")
    private String path;

    @JsonProperty("podId")
    private String podId;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("serviceId")
    private String serviceId;
}
