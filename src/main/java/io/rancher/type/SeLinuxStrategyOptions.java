package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SeLinuxStrategyOptions extends AbstractType {
    
    @JsonProperty("rule")
    private String rule;
    
    @JsonProperty("seLinuxOptions")
    private SeLinuxOptions seLinuxOptions;
    
    public String getRule() {
        return this.rule;
    }

    public void setRule(String rule) {
      this.rule = rule;
    }
    
    public SeLinuxOptions getSeLinuxOptions() {
        return this.seLinuxOptions;
    }

    public void setSeLinuxOptions(SeLinuxOptions seLinuxOptions) {
      this.seLinuxOptions = seLinuxOptions;
    }
    
}
