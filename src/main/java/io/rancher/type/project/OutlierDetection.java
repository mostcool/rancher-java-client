package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class OutlierDetection extends AbstractType {
    
    @JsonProperty("baseEjectionTime")
    private String baseEjectionTime;
    
    @JsonProperty("consecutiveErrors")
    private Integer consecutiveErrors;
    
    @JsonProperty("interval")
    private String interval;
    
    @JsonProperty("maxEjectionPercent")
    private Integer maxEjectionPercent;
    
    public String getBaseEjectionTime() {
        return this.baseEjectionTime;
    }

    public void setBaseEjectionTime(String baseEjectionTime) {
      this.baseEjectionTime = baseEjectionTime;
    }
    
    public Integer getConsecutiveErrors() {
        return this.consecutiveErrors;
    }

    public void setConsecutiveErrors(Integer consecutiveErrors) {
      this.consecutiveErrors = consecutiveErrors;
    }
    
    public String getInterval() {
        return this.interval;
    }

    public void setInterval(String interval) {
      this.interval = interval;
    }
    
    public Integer getMaxEjectionPercent() {
        return this.maxEjectionPercent;
    }

    public void setMaxEjectionPercent(Integer maxEjectionPercent) {
      this.maxEjectionPercent = maxEjectionPercent;
    }
    
}
