package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class WechatConfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("agent")
    private String agent;
    
    @JsonProperty("apiUrl")
    private String apiUrl;
    
    /**
     * required true
     */
    @JsonProperty("corp")
    private String corp;
    
    /**
     * required true
     */
    @JsonProperty("defaultRecipient")
    private String defaultRecipient;
    
    @JsonProperty("proxyUrl")
    private String proxyUrl;
    
    /**
     * required true
     */
    @JsonProperty("recipientType")
    private String recipientType;
    
    /**
     * required true
     */
    @JsonProperty("secret")
    private String secret;
    
    public String getAgent() {
        return this.agent;
    }

    public void setAgent(String agent) {
      this.agent = agent;
    }
    
    public String getApiUrl() {
        return this.apiUrl;
    }

    public void setApiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
    }
    
    public String getCorp() {
        return this.corp;
    }

    public void setCorp(String corp) {
      this.corp = corp;
    }
    
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
    
    public String getRecipientType() {
        return this.recipientType;
    }

    public void setRecipientType(String recipientType) {
      this.recipientType = recipientType;
    }
    
    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
      this.secret = secret;
    }
    
}
