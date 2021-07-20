package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Azurecredentialconfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("clientId")
    private String clientId;
    
    /**
     * required true
     */
    @JsonProperty("clientSecret")
    private String clientSecret;
    
    /**
     * required true
     */
    @JsonProperty("subscriptionId")
    private String subscriptionId;
    
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
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
}
