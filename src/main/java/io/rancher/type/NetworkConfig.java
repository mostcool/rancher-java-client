package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class NetworkConfig extends AbstractType {

    @JsonProperty("calicoNetworkProvider")
    private CalicoNetworkProvider calicoNetworkProvider;

    @JsonProperty("canalNetworkProvider")
    private CanalNetworkProvider canalNetworkProvider;

    @JsonProperty("flannelNetworkProvider")
    private FlannelNetworkProvider flannelNetworkProvider;

    @JsonProperty("mtu")
    private Integer mtu;

    @JsonProperty("nodeSelector")
    private Map<String, Object> nodeSelector;

    @JsonProperty("options")
    private Map<String, Object> options;

    @JsonProperty("plugin")
    private String plugin;

    @JsonProperty("updateStrategy")
    private DaemonSetUpdateStrategy updateStrategy;

    @JsonProperty("weaveNetworkProvider")
    private WeaveNetworkProvider weaveNetworkProvider;
}
