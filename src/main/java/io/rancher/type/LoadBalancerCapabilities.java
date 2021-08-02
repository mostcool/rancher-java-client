package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class LoadBalancerCapabilities extends AbstractType {

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("healthCheckSupported")
    private Boolean healthCheckSupported;

    @JsonProperty("protocolsSupported")
    private List<String> protocolsSupported;

    @JsonProperty("provider")
    private String provider;
}
