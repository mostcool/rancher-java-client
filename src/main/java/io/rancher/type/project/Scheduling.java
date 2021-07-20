package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Scheduling extends AbstractType {
    
    @JsonProperty("node")
    private NodeScheduling node;
    
    @JsonProperty("priority")
    private Integer priority;
    
    @JsonProperty("priorityClassName")
    private String priorityClassName;
    
    @JsonProperty("scheduler")
    private String scheduler;
    
    @JsonProperty("tolerate")
    private List<Toleration> tolerate;
    
    public NodeScheduling getNode() {
        return this.node;
    }

    public void setNode(NodeScheduling node) {
      this.node = node;
    }
    
    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
    }
    
    public String getPriorityClassName() {
        return this.priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
      this.priorityClassName = priorityClassName;
    }
    
    public String getScheduler() {
        return this.scheduler;
    }

    public void setScheduler(String scheduler) {
      this.scheduler = scheduler;
    }
    
    public List<Toleration> getTolerate() {
        return this.tolerate;
    }

    public void setTolerate(List<Toleration> tolerate) {
      this.tolerate = tolerate;
    }
    
}
