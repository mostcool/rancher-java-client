package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CloudflareProviderConfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("apiEmail")
    private String apiEmail;
    
    /**
     * required true
     */
    @JsonProperty("apiKey")
    private String apiKey;
    
    @JsonProperty("proxySetting")
    private Boolean proxySetting;
    
    public String getApiEmail() {
        return this.apiEmail;
    }

    public void setApiEmail(String apiEmail) {
      this.apiEmail = apiEmail;
    }
    
    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
      this.apiKey = apiKey;
    }
    
    public Boolean getProxySetting() {
        return this.proxySetting;
    }

    public void setProxySetting(Boolean proxySetting) {
      this.proxySetting = proxySetting;
    }
    
}
