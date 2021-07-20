package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class RuleGroup extends AbstractType {
    
    @JsonProperty("interval")
    private String interval;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("partial_response_strategy")
    private String partialResponseStrategy;
    
    @JsonProperty("rules")
    private List<Rule> rules;
    
    public String getInterval() {
        return this.interval;
    }

    public void setInterval(String interval) {
      this.interval = interval;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getPartialResponseStrategy() {
        return this.partialResponseStrategy;
    }

    public void setPartialResponseStrategy(String partialResponseStrategy) {
      this.partialResponseStrategy = partialResponseStrategy;
    }
    
    public List<Rule> getRules() {
        return this.rules;
    }

    public void setRules(List<Rule> rules) {
      this.rules = rules;
    }
    
}
