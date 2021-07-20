package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class QuerySpec extends AbstractType {
    
    @JsonProperty("lookbackDelta")
    private String lookbackDelta;
    
    @JsonProperty("maxConcurrency")
    private Integer maxConcurrency;
    
    @JsonProperty("maxSamples")
    private Integer maxSamples;
    
    @JsonProperty("timeout")
    private String timeout;
    
    public String getLookbackDelta() {
        return this.lookbackDelta;
    }

    public void setLookbackDelta(String lookbackDelta) {
      this.lookbackDelta = lookbackDelta;
    }
    
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
      this.maxConcurrency = maxConcurrency;
    }
    
    public Integer getMaxSamples() {
        return this.maxSamples;
    }

    public void setMaxSamples(Integer maxSamples) {
      this.maxSamples = maxSamples;
    }
    
    public String getTimeout() {
        return this.timeout;
    }

    public void setTimeout(String timeout) {
      this.timeout = timeout;
    }
    
}
