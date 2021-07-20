package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class NodeTemplateStatus extends AbstractType {
    
    @JsonProperty("conditions")
    private List<NodeTemplateCondition> conditions;
    
    public List<NodeTemplateCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<NodeTemplateCondition> conditions) {
      this.conditions = conditions;
    }
    
}
