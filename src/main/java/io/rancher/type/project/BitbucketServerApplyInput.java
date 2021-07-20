package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BitbucketServerApplyInput extends AbstractType {
    
    @JsonProperty("hostname")
    private String hostname;
    
    @JsonProperty("oauthToken")
    private String oauthToken;
    
    @JsonProperty("oauthVerifier")
    private String oauthVerifier;
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    @JsonProperty("tls")
    private Boolean tls;
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public String getOauthToken() {
        return this.oauthToken;
    }

    public void setOauthToken(String oauthToken) {
      this.oauthToken = oauthToken;
    }
    
    public String getOauthVerifier() {
        return this.oauthVerifier;
    }

    public void setOauthVerifier(String oauthVerifier) {
      this.oauthVerifier = oauthVerifier;
    }
    
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
    }
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
    }
    
}
