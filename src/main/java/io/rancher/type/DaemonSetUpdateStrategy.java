package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class DaemonSetUpdateStrategy extends AbstractType {
    
    @JsonProperty("rollingUpdate")
    private RollingUpdateDaemonSet rollingUpdate;
    
    @JsonProperty("strategy")
    private String strategy;
    
    public RollingUpdateDaemonSet getRollingUpdate() {
        return this.rollingUpdate;
    }

    public void setRollingUpdate(RollingUpdateDaemonSet rollingUpdate) {
      this.rollingUpdate = rollingUpdate;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
}
