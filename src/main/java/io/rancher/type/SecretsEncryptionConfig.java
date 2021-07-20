package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class SecretsEncryptionConfig extends AbstractType {
    
    @JsonProperty("customConfig")
    private Map<String, Object> customConfig;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    public Map<String, Object> getCustomConfig() {
        return this.customConfig;
    }

    public void setCustomConfig(Map<String, Object> customConfig) {
      this.customConfig = customConfig;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
}
