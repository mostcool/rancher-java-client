package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class StatefulSetStatus extends AbstractType {
    
    @JsonProperty("collisionCount")
    private Integer collisionCount;
    
    @JsonProperty("conditions")
    private List<StatefulSetCondition> conditions;
    
    @JsonProperty("currentReplicas")
    private Integer currentReplicas;
    
    @JsonProperty("currentRevision")
    private String currentRevision;
    
    @JsonProperty("observedGeneration")
    private Integer observedGeneration;
    
    @JsonProperty("readyReplicas")
    private Integer readyReplicas;
    
    @JsonProperty("replicas")
    private Integer replicas;
    
    @JsonProperty("updateRevision")
    private String updateRevision;
    
    @JsonProperty("updatedReplicas")
    private Integer updatedReplicas;
    
    public Integer getCollisionCount() {
        return this.collisionCount;
    }

    public void setCollisionCount(Integer collisionCount) {
      this.collisionCount = collisionCount;
    }
    
    public List<StatefulSetCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<StatefulSetCondition> conditions) {
      this.conditions = conditions;
    }
    
    public Integer getCurrentReplicas() {
        return this.currentReplicas;
    }

    public void setCurrentReplicas(Integer currentReplicas) {
      this.currentReplicas = currentReplicas;
    }
    
    public String getCurrentRevision() {
        return this.currentRevision;
    }

    public void setCurrentRevision(String currentRevision) {
      this.currentRevision = currentRevision;
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
    
    public String getUpdateRevision() {
        return this.updateRevision;
    }

    public void setUpdateRevision(String updateRevision) {
      this.updateRevision = updateRevision;
    }
    
    public Integer getUpdatedReplicas() {
        return this.updatedReplicas;
    }

    public void setUpdatedReplicas(Integer updatedReplicas) {
      this.updatedReplicas = updatedReplicas;
    }
    
}
