package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class LabelSelector extends AbstractType {
    
    @JsonProperty("matchExpressions")
    private List<LabelSelectorRequirement> matchExpressions;
    
    @JsonProperty("matchLabels")
    private Map<String, Object> matchLabels;
    
    public List<LabelSelectorRequirement> getMatchExpressions() {
        return this.matchExpressions;
    }

    public void setMatchExpressions(List<LabelSelectorRequirement> matchExpressions) {
      this.matchExpressions = matchExpressions;
    }
    
    public Map<String, Object> getMatchLabels() {
        return this.matchLabels;
    }

    public void setMatchLabels(Map<String, Object> matchLabels) {
      this.matchLabels = matchLabels;
    }
    
}
