package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BitbucketServerRequestLoginOutput extends AbstractType {
    
    @JsonProperty("loginUrl")
    private String loginUrl;
    
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
      this.loginUrl = loginUrl;
    }
    
}
