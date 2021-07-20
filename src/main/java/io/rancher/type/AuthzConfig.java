package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class AuthzConfig extends AbstractType {
    
    @JsonProperty("mode")
    private String mode;
    
    @JsonProperty("options")
    private Map<String, Object> options;
    
    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
      this.mode = mode;
    }
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
}
