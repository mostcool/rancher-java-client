package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class InjectDelay extends AbstractType {
    
    @JsonProperty("exponentialDelay")
    private String exponentialDelay;
    
    @JsonProperty("fixedDelay")
    private String fixedDelay;
    
    @JsonProperty("percent")
    private Integer percent;
    
    public String getExponentialDelay() {
        return this.exponentialDelay;
    }

    public void setExponentialDelay(String exponentialDelay) {
      this.exponentialDelay = exponentialDelay;
    }
    
    public String getFixedDelay() {
        return this.fixedDelay;
    }

    public void setFixedDelay(String fixedDelay) {
      this.fixedDelay = fixedDelay;
    }
    
    public Integer getPercent() {
        return this.percent;
    }

    public void setPercent(Integer percent) {
      this.percent = percent;
    }
    
}
