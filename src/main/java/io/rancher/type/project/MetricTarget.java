package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class MetricTarget extends AbstractType {
    
    @JsonProperty("averageValue")
    private String averageValue;
    
    @JsonProperty("type")
    private String type;
    
    @JsonProperty("utilization")
    private Integer utilization;
    
    @JsonProperty("value")
    private String value;
    
    public String getAverageValue() {
        return this.averageValue;
    }

    public void setAverageValue(String averageValue) {
      this.averageValue = averageValue;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public Integer getUtilization() {
        return this.utilization;
    }

    public void setUtilization(Integer utilization) {
      this.utilization = utilization;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
}
