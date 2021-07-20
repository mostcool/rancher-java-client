package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class PipelineConfig extends AbstractType {
    
    @JsonProperty("branch")
    private Constraint branch;
    
    @JsonProperty("notification")
    private PipelineNotification notification;
    
    @JsonProperty("stages")
    private List<Stage> stages;
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    public Constraint getBranch() {
        return this.branch;
    }

    public void setBranch(Constraint branch) {
      this.branch = branch;
    }
    
    public PipelineNotification getNotification() {
        return this.notification;
    }

    public void setNotification(PipelineNotification notification) {
      this.notification = notification;
    }
    
    public List<Stage> getStages() {
        return this.stages;
    }

    public void setStages(List<Stage> stages) {
      this.stages = stages;
    }
    
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
      this.timeout = timeout;
    }
    
}
