package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class QueryClusterMetricInput extends AbstractType {
    
    @JsonProperty("clusterId")
    private String clusterId;
    
    /**
     * required true
     */
    @JsonProperty("expr")
    private Integer exprFlag;
    
    @JsonProperty("from")
    private String from;
    
    @JsonProperty("interval")
    private String interval;
    
    @JsonProperty("to")
    private String to;
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public Integer getExprFlag() {
        return this.exprFlag;
    }

    public void setExprFlag(Integer exprFlag) {
      this.exprFlag = exprFlag;
    }
    
    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
      this.from = from;
    }
    
    public String getInterval() {
        return this.interval;
    }

    public void setInterval(String interval) {
      this.interval = interval;
    }
    
    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
      this.to = to;
    }
    
}
