package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PortTrafficPolicy extends AbstractType {

    @JsonProperty("connectionPool")
    private ConnectionPoolSettings connectionPool;

    @JsonProperty("loadBalancer")
    private LoadBalancerSettings loadBalancer;

    @JsonProperty("outlierDetection")
    private OutlierDetection outlierDetection;

    @JsonProperty("port")
    private PortSelector port;

    @JsonProperty("tls")
    private TlsSettings tls;
}
