package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ContainerStateRunning extends AbstractType {
    
    @JsonProperty("startedAt")
    private String startedAt;
    
    public String getStartedAt() {
        return this.startedAt;
    }

    public void setStartedAt(String startedAt) {
      this.startedAt = startedAt;
    }
    
}
