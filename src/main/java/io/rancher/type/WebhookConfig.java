package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class WebhookConfig extends AbstractType {
    
    @JsonProperty("proxyUrl")
    private String proxyUrl;
    
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
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
