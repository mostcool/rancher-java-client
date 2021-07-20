package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientIPConfig extends AbstractType {
    
    @JsonProperty("timeoutSeconds")
    private Integer timeoutSeconds;
    
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
      this.timeoutSeconds = timeoutSeconds;
    }
    
}
