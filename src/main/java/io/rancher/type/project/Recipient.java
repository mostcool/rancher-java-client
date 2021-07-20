package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Recipient extends AbstractType {
    
    @JsonProperty("notifier")
    private String notifier;
    
    @JsonProperty("recipient")
    private String recipient;
    
    public String getNotifier() {
        return this.notifier;
    }

    public void setNotifier(String notifier) {
      this.notifier = notifier;
    }
    
    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
      this.recipient = recipient;
    }
    
}
