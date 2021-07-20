package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Toleration extends AbstractType {
    
    @JsonProperty("effect")
    private String effect;
    
    @JsonProperty("key")
    private String key;
    
    @JsonProperty("operator")
    private String operator;
    
    @JsonProperty("tolerationSeconds")
    private Integer tolerationSeconds;
    
    @JsonProperty("value")
    private String value;
    
    public String getEffect() {
        return this.effect;
    }

    public void setEffect(String effect) {
      this.effect = effect;
    }
    
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
    
    public Integer getTolerationSeconds() {
        return this.tolerationSeconds;
    }

    public void setTolerationSeconds(Integer tolerationSeconds) {
      this.tolerationSeconds = tolerationSeconds;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
}
