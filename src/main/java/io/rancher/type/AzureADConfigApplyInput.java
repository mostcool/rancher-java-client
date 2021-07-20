package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class AzureADConfigApplyInput extends AbstractType {
    
    @JsonProperty("code")
    private String code;
    
    @JsonProperty("config")
    private AzureADConfig config;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public AzureADConfig getConfig() {
        return this.config;
    }

    public void setConfig(AzureADConfig config) {
      this.config = config;
    }
    
}
