package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Constraint extends AbstractType {
    
    @JsonProperty("exclude")
    private List<String> exclude;
    
    @JsonProperty("include")
    private List<String> include;
    
    public List<String> getExclude() {
        return this.exclude;
    }

    public void setExclude(List<String> exclude) {
      this.exclude = exclude;
    }
    
    public List<String> getInclude() {
        return this.include;
    }

    public void setInclude(List<String> include) {
      this.include = include;
    }
    
}
