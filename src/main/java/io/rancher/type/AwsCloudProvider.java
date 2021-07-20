package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class AwsCloudProvider extends AbstractType {
    
    @JsonProperty("global")
    private GlobalAwsOpts global;
    
    @JsonProperty("serviceOverride")
    private Map<String, Object> serviceOverride;
    
    public GlobalAwsOpts getGlobal() {
        return this.global;
    }

    public void setGlobal(GlobalAwsOpts global) {
      this.global = global;
    }
    
    public Map<String, Object> getServiceOverride() {
        return this.serviceOverride;
    }

    public void setServiceOverride(Map<String, Object> serviceOverride) {
      this.serviceOverride = serviceOverride;
    }
    
}
