package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoadBalancerOpenstackOpts extends AbstractType {

    @JsonProperty("create-monitor")
    private Boolean createMonitor;

    @JsonProperty("floating-network-id")
    private String floatingNetworkId;

    @JsonProperty("lb-method")
    private String lbMethod;

    @JsonProperty("lb-provider")
    private String lbProvider;

    @JsonProperty("lb-version")
    private String lbVersion;

    @JsonProperty("manage-security-groups")
    private Boolean manageSecurityGroups;

    @JsonProperty("monitor-delay")
    private String monitorDelay;

    @JsonProperty("monitor-max-retries")
    private Integer monitorMaxRetries;

    @JsonProperty("monitor-timeout")
    private String monitorTimeout;

    @JsonProperty("subnet-id")
    private String subnetId;

    @JsonProperty("use-octavia")
    private Boolean useOctavia;
}
