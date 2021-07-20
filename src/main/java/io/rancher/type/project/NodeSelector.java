package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class NodeSelector extends AbstractType {
    
    @JsonProperty("nodeSelectorTerms")
    private List<NodeSelectorTerm> nodeSelectorTerms;
    
    public List<NodeSelectorTerm> getNodeSelectorTerms() {
        return this.nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
      this.nodeSelectorTerms = nodeSelectorTerms;
    }
    
}
