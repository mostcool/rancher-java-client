package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class LoadBalancerCapabilities extends AbstractType {
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    @JsonProperty("healthCheckSupported")
    private Boolean healthCheckSupported;
    
    @JsonProperty("protocolsSupported")
    private List<String> protocolsSupported;
    
    @JsonProperty("provider")
    private String provider;
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public Boolean getHealthCheckSupported() {
        return this.healthCheckSupported;
    }

    public void setHealthCheckSupported(Boolean healthCheckSupported) {
      this.healthCheckSupported = healthCheckSupported;
    }
    
    public List<String> getProtocolsSupported() {
        return this.protocolsSupported;
    }

    public void setProtocolsSupported(List<String> protocolsSupported) {
      this.protocolsSupported = protocolsSupported;
    }
    
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
      this.provider = provider;
    }
    
}
