package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ContainerStatus extends AbstractType {
    
    @JsonProperty("containerID")
    private String containerId;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("imageID")
    private String imageId;
    
    @JsonProperty("lastState")
    private ContainerState lastState;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ready")
    private Boolean ready;
    
    @JsonProperty("restartCount")
    private Integer restartCount;
    
    @JsonProperty("started")
    private Boolean started;
    
    @JsonProperty("state")
    private ContainerState state;
    
    public String getContainerId() {
        return this.containerId;
    }

    public void setContainerId(String containerId) {
      this.containerId = containerId;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
      this.imageId = imageId;
    }
    
    public ContainerState getLastState() {
        return this.lastState;
    }

    public void setLastState(ContainerState lastState) {
      this.lastState = lastState;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Boolean getReady() {
        return this.ready;
    }

    public void setReady(Boolean ready) {
      this.ready = ready;
    }
    
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public void setRestartCount(Integer restartCount) {
      this.restartCount = restartCount;
    }
    
    public Boolean getStarted() {
        return this.started;
    }

    public void setStarted(Boolean started) {
      this.started = started;
    }
    
    public ContainerState getState() {
        return this.state;
    }

    public void setState(ContainerState state) {
      this.state = state;
    }
    
}
