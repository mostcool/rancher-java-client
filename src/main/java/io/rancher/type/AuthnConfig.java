package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class AuthnConfig extends AbstractType {
    
    @JsonProperty("sans")
    private List<String> sans;
    
    @JsonProperty("strategy")
    private String strategy;
    
    @JsonProperty("webhook")
    private AuthWebhookConfig webhook;
    
    public List<String> getSans() {
        return this.sans;
    }

    public void setSans(List<String> sans) {
      this.sans = sans;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
    public AuthWebhookConfig getWebhook() {
        return this.webhook;
    }

    public void setWebhook(AuthWebhookConfig webhook) {
      this.webhook = webhook;
    }
    
}
