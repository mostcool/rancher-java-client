package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class GoogleOauthConfigTestOutput extends AbstractType {
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
    }
    
}
