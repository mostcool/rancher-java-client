package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class NodeSelectorRequirement extends AbstractType {
    
    @JsonProperty("key")
    private String key;
    
    @JsonProperty("operator")
    private String operator;
    
    @JsonProperty("values")
    private List<String> values;
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
      this.operator = operator;
    }
    
    public List<String> getValues() {
        return this.values;
    }

    public void setValues(List<String> values) {
      this.values = values;
    }
    
}
