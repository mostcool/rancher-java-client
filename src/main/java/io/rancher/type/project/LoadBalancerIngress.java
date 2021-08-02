package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoadBalancerIngress extends AbstractType {

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("ip")
    private String ip;
}
