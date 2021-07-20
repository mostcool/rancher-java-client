package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class NodeSelectorTerm extends AbstractType {
    
    @JsonProperty("matchExpressions")
    private List<NodeSelectorRequirement> matchExpressions;
    
    @JsonProperty("matchFields")
    private List<NodeSelectorRequirement> matchFields;
    
    public List<NodeSelectorRequirement> getMatchExpressions() {
        return this.matchExpressions;
    }

    public void setMatchExpressions(List<NodeSelectorRequirement> matchExpressions) {
      this.matchExpressions = matchExpressions;
    }
    
    public List<NodeSelectorRequirement> getMatchFields() {
        return this.matchFields;
    }

    public void setMatchFields(List<NodeSelectorRequirement> matchFields) {
      this.matchFields = matchFields;
    }
    
}
