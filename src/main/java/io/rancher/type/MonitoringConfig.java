package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class MonitoringConfig extends AbstractType {

    @JsonProperty("nodeSelector")
    private Map<String, Object> nodeSelector;

    @JsonProperty("options")
    private Map<String, Object> options;

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("replicas")
    private Integer replicas;

    @JsonProperty("updateStrategy")
    private DeploymentStrategy updateStrategy;
}
