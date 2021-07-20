package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class DeploymentStrategy extends AbstractType {
    
    @JsonProperty("rollingUpdate")
    private RollingUpdateDeployment rollingUpdate;
    
    @JsonProperty("strategy")
    private String strategy;
    
    public RollingUpdateDeployment getRollingUpdate() {
        return this.rollingUpdate;
    }

    public void setRollingUpdate(RollingUpdateDeployment rollingUpdate) {
      this.rollingUpdate = rollingUpdate;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
}
