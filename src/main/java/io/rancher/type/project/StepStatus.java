package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StepStatus extends AbstractType {
    
    @JsonProperty("ended")
    private String ended;
    
    @JsonProperty("started")
    private String started;
    
    @JsonProperty("state")
    private String state;
    
    public String getEnded() {
        return this.ended;
    }

    public void setEnded(String ended) {
      this.ended = ended;
    }
    
    public String getStarted() {
        return this.started;
    }

    public void setStarted(String started) {
      this.started = started;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
}
