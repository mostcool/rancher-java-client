package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ClusterComponentStatus extends AbstractType {
    
    @JsonProperty("conditions")
    private List<ComponentCondition> conditions;
    
    @JsonProperty("name")
    private String name;
    
    public List<ComponentCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ComponentCondition> conditions) {
      this.conditions = conditions;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
