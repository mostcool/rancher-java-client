package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Capabilities extends AbstractType {

    @JsonProperty("ingressCapabilities")
    private List<IngressCapabilities> ingressCapabilities;

    @JsonProperty("loadBalancerCapabilities")
    private LoadBalancerCapabilities loadBalancerCapabilities;

    @JsonProperty("nodePoolScalingSupported")
    private Boolean nodePoolScalingSupported;

    @JsonProperty("nodePortRange")
    private String nodePortRange;

    @JsonProperty("pspEnabled")
    private Boolean pspEnabled;

    @JsonProperty("taintSupport")
    private Boolean taintSupport;
}
