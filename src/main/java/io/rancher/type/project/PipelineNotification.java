package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class PipelineNotification extends AbstractType {
    
    @JsonProperty("condition")
    private List<String> condition;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("recipients")
    private List<Recipient> recipients;
    
    public List<String> getCondition() {
        return this.condition;
    }

    public void setCondition(List<String> condition) {
      this.condition = condition;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public List<Recipient> getRecipients() {
        return this.recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
      this.recipients = recipients;
    }
    
}
