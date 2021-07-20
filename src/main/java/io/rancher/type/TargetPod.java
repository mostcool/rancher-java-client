package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class TargetPod extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("condition")
    private String condition;
    
    /**
     * required true
     */
    @JsonProperty("podId")
    private String podId;
    
    @JsonProperty("restartIntervalSeconds")
    private Integer restartIntervalSeconds;
    
    @JsonProperty("restartTimes")
    private Integer restartTimes;
    
    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
      this.condition = condition;
    }
    
    public String getPodId() {
        return this.podId;
    }

    public void setPodId(String podId) {
      this.podId = podId;
    }
    
    public Integer getRestartIntervalSeconds() {
        return this.restartIntervalSeconds;
    }

    public void setRestartIntervalSeconds(Integer restartIntervalSeconds) {
      this.restartIntervalSeconds = restartIntervalSeconds;
    }
    
    public Integer getRestartTimes() {
        return this.restartTimes;
    }

    public void setRestartTimes(Integer restartTimes) {
      this.restartTimes = restartTimes;
    }
    
}
