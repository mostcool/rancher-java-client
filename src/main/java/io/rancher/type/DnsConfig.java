package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class DnsConfig extends AbstractType {

    @JsonProperty("linearAutoscalerParams")
    private LinearAutoscalerParams linearAutoscalerParams;

    @JsonProperty("nodeSelector")
    private Map<String, Object> nodeSelector;

    @JsonProperty("nodelocal")
    private Nodelocal nodelocal;

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("reversecidrs")
    private List<String> reversecidrs;

    @JsonProperty("stubdomains")
    private Map<String, Object> stubdomains;

    @JsonProperty("updateStrategy")
    private DeploymentStrategy updateStrategy;

    @JsonProperty("upstreamnameservers")
    private List<String> upstreamnameservers;
}
