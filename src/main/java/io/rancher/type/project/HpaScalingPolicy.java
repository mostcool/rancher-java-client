package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class HpaScalingPolicy extends AbstractType {
    
    @JsonProperty("periodSeconds")
    private Integer periodSeconds;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("value")
    private Integer value;
    
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
      this.periodSeconds = periodSeconds;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
      this.value = value;
    }
    
}
