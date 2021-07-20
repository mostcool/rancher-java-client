package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Constraints extends AbstractType {
    
    @JsonProperty("branch")
    private Constraint branch;
    
    @JsonProperty("event")
    private Constraint event;
    
    public Constraint getBranch() {
        return this.branch;
    }

    public void setBranch(Constraint branch) {
      this.branch = branch;
    }
    
    public Constraint getEvent() {
        return this.event;
    }

    public void setEvent(Constraint event) {
      this.event = event;
    }
    
}
