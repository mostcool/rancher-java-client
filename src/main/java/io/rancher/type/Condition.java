package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Condition extends AbstractType {
    
    @JsonProperty("lastTransitionTime")
    private String lastTransitionTime;
    
    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("reason")
    private String reason;
    
    @JsonProperty("status")
    private String status;
    
    @JsonProperty("type")
    private String type;
    
    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    public void setLastTransitionTime(String lastTransitionTime) {
      this.lastTransitionTime = lastTransitionTime;
    }
    
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
    
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
      this.status = status;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}
