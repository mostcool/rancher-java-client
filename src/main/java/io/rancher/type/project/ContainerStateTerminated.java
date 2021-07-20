package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ContainerStateTerminated extends AbstractType {
    
    @JsonProperty("containerID")
    private String containerId;
    
    @JsonProperty("exitCode")
    private Integer exitCode;
    
    @JsonProperty("finishedAt")
    private String finishedAt;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("reason")
    private String reason;
    
    @JsonProperty("signal")
    private Integer signal;
    
    @JsonProperty("startedAt")
    private String startedAt;
    
    public String getContainerId() {
        return this.containerId;
    }

    public void setContainerId(String containerId) {
      this.containerId = containerId;
    }
    
    public Integer getExitCode() {
        return this.exitCode;
    }

    public void setExitCode(Integer exitCode) {
      this.exitCode = exitCode;
    }
    
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
      this.finishedAt = finishedAt;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
    
    public Integer getSignal() {
        return this.signal;
    }

    public void setSignal(Integer signal) {
      this.signal = signal;
    }
    
    public String getStartedAt() {
        return this.startedAt;
    }

    public void setStartedAt(String startedAt) {
      this.startedAt = startedAt;
    }
    
}
