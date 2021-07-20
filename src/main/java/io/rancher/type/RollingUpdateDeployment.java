package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RollingUpdateDeployment extends AbstractType {
    
    @JsonProperty("maxSurge")
    private Integer maxSurge;
    
    @JsonProperty("maxUnavailable")
    private Integer maxUnavailable;
    
    public Integer getMaxSurge() {
        return this.maxSurge;
    }

    public void setMaxSurge(Integer maxSurge) {
      this.maxSurge = maxSurge;
    }
    
    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public void setMaxUnavailable(Integer maxUnavailable) {
      this.maxUnavailable = maxUnavailable;
    }
    
}
