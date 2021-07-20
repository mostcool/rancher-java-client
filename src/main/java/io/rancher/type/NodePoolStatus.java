package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class NodePoolStatus extends AbstractType {
    
    @JsonProperty("conditions")
    private List<Condition> conditions;
    
    public List<Condition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<Condition> conditions) {
      this.conditions = conditions;
    }
    
}
