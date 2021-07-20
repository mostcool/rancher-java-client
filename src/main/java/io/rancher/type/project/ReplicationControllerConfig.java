package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ReplicationControllerConfig extends AbstractType {
    
    @JsonProperty("minReadySeconds")
    private Integer minReadySeconds;
    
    public Integer getMinReadySeconds() {
        return this.minReadySeconds;
    }

    public void setMinReadySeconds(Integer minReadySeconds) {
      this.minReadySeconds = minReadySeconds;
    }
    
}
