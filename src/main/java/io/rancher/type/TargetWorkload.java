package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class TargetWorkload extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("availablePercentage")
    private Integer availablePercentage;
    
    @JsonProperty("selector")
    private Map<String, Object> selector;
    
    @JsonProperty("workloadId")
    private String workloadId;
    
    public Integer getAvailablePercentage() {
        return this.availablePercentage;
    }

    public void setAvailablePercentage(Integer availablePercentage) {
      this.availablePercentage = availablePercentage;
    }
    
    public Map<String, Object> getSelector() {
        return this.selector;
    }

    public void setSelector(Map<String, Object> selector) {
      this.selector = selector;
    }
    
    public String getWorkloadId() {
        return this.workloadId;
    }

    public void setWorkloadId(String workloadId) {
      this.workloadId = workloadId;
    }
    
}
