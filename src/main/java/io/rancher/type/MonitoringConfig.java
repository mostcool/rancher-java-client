package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

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
    
    public Map<String, Object> getNodeSelector() {
        return this.nodeSelector;
    }

    public void setNodeSelector(Map<String, Object> nodeSelector) {
      this.nodeSelector = nodeSelector;
    }
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
      this.provider = provider;
    }
    
    public Integer getReplicas() {
        return this.replicas;
    }

    public void setReplicas(Integer replicas) {
      this.replicas = replicas;
    }
    
    public DeploymentStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }

    public void setUpdateStrategy(DeploymentStrategy updateStrategy) {
      this.updateStrategy = updateStrategy;
    }
    
}
