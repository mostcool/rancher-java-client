package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PodReadinessGate extends AbstractType {
    
    @JsonProperty("conditionType")
    private String conditionType;
    
    public String getConditionType() {
        return this.conditionType;
    }

    public void setConditionType(String conditionType) {
      this.conditionType = conditionType;
    }
    
}
