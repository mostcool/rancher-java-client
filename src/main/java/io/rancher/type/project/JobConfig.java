package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class JobConfig extends AbstractType {
    
    @JsonProperty("activeDeadlineSeconds")
    private Integer activeDeadlineSeconds;
    
    @JsonProperty("backoffLimit")
    private Integer backoffLimit;
    
    @JsonProperty("completions")
    private Integer completions;
    
    @JsonProperty("manualSelector")
    private Boolean manualSelector;
    
    @JsonProperty("parallelism")
    private Integer parallelism;
    
    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
      this.activeDeadlineSeconds = activeDeadlineSeconds;
    }
    
    public Integer getBackoffLimit() {
        return this.backoffLimit;
    }

    public void setBackoffLimit(Integer backoffLimit) {
      this.backoffLimit = backoffLimit;
    }
    
    public Integer getCompletions() {
        return this.completions;
    }

    public void setCompletions(Integer completions) {
      this.completions = completions;
    }
    
    public Boolean getManualSelector() {
        return this.manualSelector;
    }

    public void setManualSelector(Boolean manualSelector) {
      this.manualSelector = manualSelector;
    }
    
    public Integer getParallelism() {
        return this.parallelism;
    }

    public void setParallelism(Integer parallelism) {
      this.parallelism = parallelism;
    }
    
}
