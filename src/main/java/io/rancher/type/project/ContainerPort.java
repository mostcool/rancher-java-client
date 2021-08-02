package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ContainerPort extends AbstractType {

    @JsonProperty("containerPort")
    private Integer containerPort;

    @JsonProperty("dnsName")
    private String dnsName;

    @JsonProperty("hostIp")
    private String hostIp;

    @JsonProperty("hostPort")
    private Integer hostPort;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("name")
    private String name;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("sourcePort")
    private Integer sourcePort;
}
