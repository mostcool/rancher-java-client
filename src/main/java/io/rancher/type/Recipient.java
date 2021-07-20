package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Recipient extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("notifierId")
    private String notifierId;
    
    /**
     * required true
     */
    @JsonProperty("notifierType")
    private String notifierType;
    
    @JsonProperty("recipient")
    private String recipient;
    
    public String getNotifierId() {
        return this.notifierId;
    }

    public void setNotifierId(String notifierId) {
      this.notifierId = notifierId;
    }
    
    public String getNotifierType() {
        return this.notifierType;
    }

    public void setNotifierType(String notifierType) {
      this.notifierType = notifierType;
    }
    
    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
      this.recipient = recipient;
    }
    
}
