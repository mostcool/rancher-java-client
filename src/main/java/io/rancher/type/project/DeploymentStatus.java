package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class DeploymentStatus extends AbstractType {
    
    @JsonProperty("availableReplicas")
    private Integer availableReplicas;
    
    @JsonProperty("collisionCount")
    private Integer collisionCount;
    
    @JsonProperty("conditions")
    private List<DeploymentCondition> conditions;
    
    @JsonProperty("observedGeneration")
    private Integer observedGeneration;
    
    @JsonProperty("readyReplicas")
    private Integer readyReplicas;
    
    @JsonProperty("replicas")
    private Integer replicas;
    
    @JsonProperty("unavailableReplicas")
    private Integer unavailableReplicas;
    
    @JsonProperty("updatedReplicas")
    private Integer updatedReplicas;
    
    public Integer getAvailableReplicas() {
        return this.availableReplicas;
    }

    public void setAvailableReplicas(Integer availableReplicas) {
      this.availableReplicas = availableReplicas;
    }
    
    public Integer getCollisionCount() {
        return this.collisionCount;
    }

    public void setCollisionCount(Integer collisionCount) {
      this.collisionCount = collisionCount;
    }
    
    public List<DeploymentCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<DeploymentCondition> conditions) {
      this.conditions = conditions;
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
    
    public Integer getUnavailableReplicas() {
        return this.unavailableReplicas;
    }

    public void setUnavailableReplicas(Integer unavailableReplicas) {
      this.unavailableReplicas = unavailableReplicas;
    }
    
    public Integer getUpdatedReplicas() {
        return this.updatedReplicas;
    }

    public void setUpdatedReplicas(Integer updatedReplicas) {
      this.updatedReplicas = updatedReplicas;
    }
    
}
