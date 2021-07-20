package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class DingtalkConfig extends AbstractType {
    
    @JsonProperty("proxyUrl")
    private String proxyUrl;
    
    @JsonProperty("secret")
    private String secret;
    
    /**
     * required true
     */
    @JsonProperty("url")
    private String url;
    
    public String getProxyUrl() {
        return this.proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
      this.proxyUrl = proxyUrl;
    }
    
    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
      this.secret = secret;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
