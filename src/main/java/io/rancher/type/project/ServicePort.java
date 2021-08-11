package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ServicePort extends AbstractType {

    @JsonProperty("appProtocol")
    private String appProtocol;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nodePort")
    private Integer nodePort;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("targetPort")
    private String targetPort;
}
