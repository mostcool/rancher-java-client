package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class HttpRetry extends AbstractType {
    
    @JsonProperty("attempts")
    private Integer attempts;
    
    @JsonProperty("perTryTimeout")
    private String perTryTimeout;
    
    public Integer getAttempts() {
        return this.attempts;
    }

    public void setAttempts(Integer attempts) {
      this.attempts = attempts;
    }
    
    public String getPerTryTimeout() {
        return this.perTryTimeout;
    }

    public void setPerTryTimeout(String perTryTimeout) {
      this.perTryTimeout = perTryTimeout;
    }
    
}
