package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PodCondition extends AbstractType {
    
    @JsonProperty("lastProbeTime")
    private String lastProbeTime;
    
    @JsonProperty("lastTransitionTime")
    private String lastTransitionTime;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("reason")
    private String reason;
    
    @JsonProperty("status")
    private String status;
    
    @JsonProperty("type")
    private String type;
    
    public String getLastProbeTime() {
        return this.lastProbeTime;
    }

    public void setLastProbeTime(String lastProbeTime) {
      this.lastProbeTime = lastProbeTime;
    }
    
    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    public void setLastTransitionTime(String lastTransitionTime) {
      this.lastTransitionTime = lastTransitionTime;
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
