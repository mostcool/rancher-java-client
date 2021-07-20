package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class GoogleOauthConfigApplyInput extends AbstractType {
    
    @JsonProperty("code")
    private String code;
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    @JsonProperty("googleOauthConfig")
    private GoogleOauthConfig googleOauthConfig;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public GoogleOauthConfig getGoogleOauthConfig() {
        return this.googleOauthConfig;
    }

    public void setGoogleOauthConfig(GoogleOauthConfig googleOauthConfig) {
      this.googleOauthConfig = googleOauthConfig;
    }
    
}
