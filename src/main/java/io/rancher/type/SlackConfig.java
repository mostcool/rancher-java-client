package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackConfig extends AbstractType {
    
    @JsonProperty("defaultRecipient")
    private String defaultRecipient;
    
    @JsonProperty("proxyUrl")
    private String proxyUrl;
    
    /**
     * required true
     */
    @JsonProperty("url")
    private String url;
    
    public String getDefaultRecipient() {
        return this.defaultRecipient;
    }

    public void setDefaultRecipient(String defaultRecipient) {
      this.defaultRecipient = defaultRecipient;
    }
    
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
