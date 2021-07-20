package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class AuthWebhookConfig extends AbstractType {
    
    @JsonProperty("cacheTimeout")
    private String cacheTimeout;
    
    @JsonProperty("configFile")
    private String configFile;
    
    public String getCacheTimeout() {
        return this.cacheTimeout;
    }

    public void setCacheTimeout(String cacheTimeout) {
      this.cacheTimeout = cacheTimeout;
    }
    
    public String getConfigFile() {
        return this.configFile;
    }

    public void setConfigFile(String configFile) {
      this.configFile = configFile;
    }
    
}
