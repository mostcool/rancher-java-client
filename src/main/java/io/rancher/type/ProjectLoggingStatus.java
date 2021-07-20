package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class ProjectLoggingStatus extends AbstractType {
    
    @JsonProperty("appliedSpec")
    private ProjectLoggingSpec appliedSpec;
    
    @JsonProperty("conditions")
    private List<LoggingCondition> conditions;
    
    public ProjectLoggingSpec getAppliedSpec() {
        return this.appliedSpec;
    }

    public void setAppliedSpec(ProjectLoggingSpec appliedSpec) {
      this.appliedSpec = appliedSpec;
    }
    
    public List<LoggingCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<LoggingCondition> conditions) {
      this.conditions = conditions;
    }
    
}
