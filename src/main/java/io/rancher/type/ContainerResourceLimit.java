package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ContainerResourceLimit extends AbstractType {
    
    @JsonProperty("limitsCpu")
    private String limitsCpu;
    
    @JsonProperty("limitsMemory")
    private String limitsMemory;
    
    @JsonProperty("requestsCpu")
    private String requestsCpu;
    
    @JsonProperty("requestsMemory")
    private String requestsMemory;
    
    public String getLimitsCpu() {
        return this.limitsCpu;
    }

    public void setLimitsCpu(String limitsCpu) {
      this.limitsCpu = limitsCpu;
    }
    
    public String getLimitsMemory() {
        return this.limitsMemory;
    }

    public void setLimitsMemory(String limitsMemory) {
      this.limitsMemory = limitsMemory;
    }
    
    public String getRequestsCpu() {
        return this.requestsCpu;
    }

    public void setRequestsCpu(String requestsCpu) {
      this.requestsCpu = requestsCpu;
    }
    
    public String getRequestsMemory() {
        return this.requestsMemory;
    }

    public void setRequestsMemory(String requestsMemory) {
      this.requestsMemory = requestsMemory;
    }
    
}
