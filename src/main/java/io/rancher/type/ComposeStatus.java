package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class ComposeStatus extends AbstractType {
    
    @JsonProperty("conditions")
    private List<ComposeCondition> conditions;
    
    public List<ComposeCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ComposeCondition> conditions) {
      this.conditions = conditions;
    }
    
}
