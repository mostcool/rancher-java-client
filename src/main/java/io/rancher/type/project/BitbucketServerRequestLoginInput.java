package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BitbucketServerRequestLoginInput extends AbstractType {
    
    @JsonProperty("hostname")
    private String hostname;
    
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
