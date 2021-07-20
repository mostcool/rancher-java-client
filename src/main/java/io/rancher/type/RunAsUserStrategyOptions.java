package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class RunAsUserStrategyOptions extends AbstractType {
    
    @JsonProperty("ranges")
    private List<IdRange> ranges;
    
    @JsonProperty("rule")
    private String rule;
    
    public List<IdRange> getRanges() {
        return this.ranges;
    }

    public void setRanges(List<IdRange> ranges) {
      this.ranges = ranges;
    }
    
    public String getRule() {
        return this.rule;
    }

    public void setRule(String rule) {
      this.rule = rule;
    }
    
}
