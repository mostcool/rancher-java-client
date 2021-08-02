package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class VirtualCenterConfig extends AbstractType {

    @JsonProperty("datacenters")
    private String datacenters;

    @JsonProperty("password")
    private String password;

    @JsonProperty("port")
    private String port;

    @JsonProperty("soap-roundtrip-count")
    private Integer soapRoundtripCount;

    @JsonProperty("user")
    private String user;
}
