package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class DeploymentConfig extends AbstractType {
    
    @JsonProperty("maxSurge")
    private Integer maxSurge;
    
    @JsonProperty("maxUnavailable")
    private Integer maxUnavailable;
    
    @JsonProperty("minReadySeconds")
    private Integer minReadySeconds;
    
    @JsonProperty("progressDeadlineSeconds")
    private Integer progressDeadlineSeconds;
    
    @JsonProperty("revisionHistoryLimit")
    private Integer revisionHistoryLimit;
    
    @JsonProperty("strategy")
    private String strategy;
    
    public Integer getMaxSurge() {
        return this.maxSurge;
    }

    public void setMaxSurge(Integer maxSurge) {
      this.maxSurge = maxSurge;
    }
    
    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public void setMaxUnavailable(Integer maxUnavailable) {
      this.maxUnavailable = maxUnavailable;
    }
    
    public Integer getMinReadySeconds() {
        return this.minReadySeconds;
    }

    public void setMinReadySeconds(Integer minReadySeconds) {
      this.minReadySeconds = minReadySeconds;
    }
    
    public Integer getProgressDeadlineSeconds() {
        return this.progressDeadlineSeconds;
    }

    public void setProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
      this.progressDeadlineSeconds = progressDeadlineSeconds;
    }
    
    public Integer getRevisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
      this.revisionHistoryLimit = revisionHistoryLimit;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
}
