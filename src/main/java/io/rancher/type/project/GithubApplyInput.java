package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubApplyInput extends AbstractType {
    
    @JsonProperty("clientId")
    private String clientId;
    
    @JsonProperty("clientSecret")
    private String clientSecret;
    
    @JsonProperty("code")
    private String code;
    
    @JsonProperty("hostname")
    private String hostname;
    
    @JsonProperty("inheritAuth")
    private Boolean inheritAuth;
    
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    
    @JsonProperty("tls")
    private Boolean tls;
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
    }
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public Boolean getInheritAuth() {
        return this.inheritAuth;
    }

    public void setInheritAuth(Boolean inheritAuth) {
      this.inheritAuth = inheritAuth;
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
