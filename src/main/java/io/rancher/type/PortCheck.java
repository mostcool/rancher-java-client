package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PortCheck extends AbstractType {

    @JsonProperty("address")
    private String address;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("protocol")
    private String protocol;
}
