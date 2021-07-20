package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ReplicationControllerStatus extends AbstractType {
    
    @JsonProperty("availableReplicas")
    private Integer availableReplicas;
    
    @JsonProperty("conditions")
    private List<ReplicationControllerCondition> conditions;
    
    @JsonProperty("fullyLabeledReplicas")
    private Integer fullyLabeledReplicas;
    
    @JsonProperty("observedGeneration")
    private Integer observedGeneration;
    
    @JsonProperty("readyReplicas")
    private Integer readyReplicas;
    
    @JsonProperty("replicas")
    private Integer replicas;
    
    public Integer getAvailableReplicas() {
        return this.availableReplicas;
    }

    public void setAvailableReplicas(Integer availableReplicas) {
      this.availableReplicas = availableReplicas;
    }
    
    public List<ReplicationControllerCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ReplicationControllerCondition> conditions) {
      this.conditions = conditions;
    }
    
    public Integer getFullyLabeledReplicas() {
        return this.fullyLabeledReplicas;
    }

    public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
      this.fullyLabeledReplicas = fullyLabeledReplicas;
    }
    
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    public void setObservedGeneration(Integer observedGeneration) {
      this.observedGeneration = observedGeneration;
    }
    
    public Integer getReadyReplicas() {
        return this.readyReplicas;
    }

    public void setReadyReplicas(Integer readyReplicas) {
      this.readyReplicas = readyReplicas;
    }
    
    public Integer getReplicas() {
        return this.replicas;
    }

    public void setReplicas(Integer replicas) {
      this.replicas = replicas;
    }
    
}
