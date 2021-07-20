package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class DaemonSetStatus extends AbstractType {
    
    @JsonProperty("collisionCount")
    private Integer collisionCount;
    
    @JsonProperty("conditions")
    private List<DaemonSetCondition> conditions;
    
    @JsonProperty("currentNumberScheduled")
    private Integer currentNumberScheduled;
    
    @JsonProperty("desiredNumberScheduled")
    private Integer desiredNumberScheduled;
    
    @JsonProperty("numberAvailable")
    private Integer numberAvailable;
    
    @JsonProperty("numberMisscheduled")
    private Integer numberMisscheduled;
    
    @JsonProperty("numberReady")
    private Integer numberReady;
    
    @JsonProperty("numberUnavailable")
    private Integer numberUnavailable;
    
    @JsonProperty("observedGeneration")
    private Integer observedGeneration;
    
    @JsonProperty("updatedNumberScheduled")
    private Integer updatedNumberScheduled;
    
    public Integer getCollisionCount() {
        return this.collisionCount;
    }

    public void setCollisionCount(Integer collisionCount) {
      this.collisionCount = collisionCount;
    }
    
    public List<DaemonSetCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<DaemonSetCondition> conditions) {
      this.conditions = conditions;
    }
    
    public Integer getCurrentNumberScheduled() {
        return this.currentNumberScheduled;
    }

    public void setCurrentNumberScheduled(Integer currentNumberScheduled) {
      this.currentNumberScheduled = currentNumberScheduled;
    }
    
    public Integer getDesiredNumberScheduled() {
        return this.desiredNumberScheduled;
    }

    public void setDesiredNumberScheduled(Integer desiredNumberScheduled) {
      this.desiredNumberScheduled = desiredNumberScheduled;
    }
    
    public Integer getNumberAvailable() {
        return this.numberAvailable;
    }

    public void setNumberAvailable(Integer numberAvailable) {
      this.numberAvailable = numberAvailable;
    }
    
    public Integer getNumberMisscheduled() {
        return this.numberMisscheduled;
    }

    public void setNumberMisscheduled(Integer numberMisscheduled) {
      this.numberMisscheduled = numberMisscheduled;
    }
    
    public Integer getNumberReady() {
        return this.numberReady;
    }

    public void setNumberReady(Integer numberReady) {
      this.numberReady = numberReady;
    }
    
    public Integer getNumberUnavailable() {
        return this.numberUnavailable;
    }

    public void setNumberUnavailable(Integer numberUnavailable) {
      this.numberUnavailable = numberUnavailable;
    }
    
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    public void setObservedGeneration(Integer observedGeneration) {
      this.observedGeneration = observedGeneration;
    }
    
    public Integer getUpdatedNumberScheduled() {
        return this.updatedNumberScheduled;
    }

    public void setUpdatedNumberScheduled(Integer updatedNumberScheduled) {
      this.updatedNumberScheduled = updatedNumberScheduled;
    }
    
}
