package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class EventRule extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("eventType")
    private String eventType;
    
    /**
     * required true
     */
    @JsonProperty("resourceKind")
    private String resourceKind;
    
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
      this.eventType = eventType;
    }
    
    public String getResourceKind() {
        return this.resourceKind;
    }

    public void setResourceKind(String resourceKind) {
      this.resourceKind = resourceKind;
    }
    
}
