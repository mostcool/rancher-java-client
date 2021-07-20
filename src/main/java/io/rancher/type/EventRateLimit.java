package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class EventRateLimit extends AbstractType {
    
    @JsonProperty("configuration")
    private Map<String, Object> configuration;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    public Map<String, Object> getConfiguration() {
        return this.configuration;
    }

    public void setConfiguration(Map<String, Object> configuration) {
      this.configuration = configuration;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
}
