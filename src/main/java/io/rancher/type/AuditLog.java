package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class AuditLog extends AbstractType {
    
    @JsonProperty("configuration")
    private AuditLogConfig configuration;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    public AuditLogConfig getConfiguration() {
        return this.configuration;
    }

    public void setConfiguration(AuditLogConfig configuration) {
      this.configuration = configuration;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
}
