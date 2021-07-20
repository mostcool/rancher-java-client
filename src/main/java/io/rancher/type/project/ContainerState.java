package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ContainerState extends AbstractType {
    
    @JsonProperty("running")
    private ContainerStateRunning running;
    
    @JsonProperty("terminated")
    private ContainerStateTerminated terminated;
    
    @JsonProperty("waiting")
    private ContainerStateWaiting waiting;
    
    public ContainerStateRunning getRunning() {
        return this.running;
    }

    public void setRunning(ContainerStateRunning running) {
      this.running = running;
    }
    
    public ContainerStateTerminated getTerminated() {
        return this.terminated;
    }

    public void setTerminated(ContainerStateTerminated terminated) {
      this.terminated = terminated;
    }
    
    public ContainerStateWaiting getWaiting() {
        return this.waiting;
    }

    public void setWaiting(ContainerStateWaiting waiting) {
      this.waiting = waiting;
    }
    
}
