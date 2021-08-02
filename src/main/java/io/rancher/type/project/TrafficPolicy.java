package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TrafficPolicy extends AbstractType {

    @JsonProperty("connectionPool")
    private ConnectionPoolSettings connectionPool;

    @JsonProperty("loadBalancer")
    private LoadBalancerSettings loadBalancer;

    @JsonProperty("outlierDetection")
    private OutlierDetection outlierDetection;

    @JsonProperty("portLevelSettings")
    private List<PortTrafficPolicy> portLevelSettings;

    @JsonProperty("tls")
    private TlsSettings tls;
}
