package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class UpgradeStrategy extends AbstractType {
    
    @JsonProperty("rollingUpdate")
    private RollingUpdate rollingUpdate;
    
    public RollingUpdate getRollingUpdate() {
        return this.rollingUpdate;
    }

    public void setRollingUpdate(RollingUpdate rollingUpdate) {
      this.rollingUpdate = rollingUpdate;
    }
    
}
