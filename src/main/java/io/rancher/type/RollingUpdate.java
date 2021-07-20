package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RollingUpdate extends AbstractType {
    
    @JsonProperty("batchSize")
    private Integer batchSize;
    
    @JsonProperty("interval")
    private Integer interval;
    
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public void setBatchSize(Integer batchSize) {
      this.batchSize = batchSize;
    }
    
    public Integer getInterval() {
        return this.interval;
    }

    public void setInterval(Integer interval) {
      this.interval = interval;
    }
    
}
