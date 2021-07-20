package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PreferredSchedulingTerm extends AbstractType {
    
    @JsonProperty("preference")
    private NodeSelectorTerm preference;
    
    @JsonProperty("weight")
    private Integer weight;
    
    public NodeSelectorTerm getPreference() {
        return this.preference;
    }

    public void setPreference(NodeSelectorTerm preference) {
      this.preference = preference;
    }
    
    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
      this.weight = weight;
    }
    
}
