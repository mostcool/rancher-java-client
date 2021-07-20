package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class QueryProjectMetricInput extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("expr")
    private Integer exprFlag;
    
    @JsonProperty("from")
    private String from;
    
    @JsonProperty("interval")
    private String interval;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("to")
    private String to;
    
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
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
      this.to = to;
    }
    
}
