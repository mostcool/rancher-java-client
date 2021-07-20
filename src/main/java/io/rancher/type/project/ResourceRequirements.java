package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class ResourceRequirements extends AbstractType {
    
    @JsonProperty("limits")
    private Map<String, Object> limits;
    
    @JsonProperty("requests")
    private Map<String, Object> requests;
    
    public Map<String, Object> getLimits() {
        return this.limits;
    }

    public void setLimits(Map<String, Object> limits) {
      this.limits = limits;
    }
    
    public Map<String, Object> getRequests() {
        return this.requests;
    }

    public void setRequests(Map<String, Object> requests) {
      this.requests = requests;
    }
    
}
