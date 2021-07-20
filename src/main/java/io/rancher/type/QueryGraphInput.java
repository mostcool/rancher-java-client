package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class QueryGraphInput extends AbstractType {
    
    @JsonProperty("filters")
    private Map<String, Object> filters;
    
    @JsonProperty("from")
    private String from;
    
    @JsonProperty("interval")
    private String interval;
    
    @JsonProperty("isDetails")
    private Boolean isDetails;
    
    @JsonProperty("metricParams")
    private Map<String, Object> metricParams;
    
    @JsonProperty("to")
    private String to;
    
    public Map<String, Object> getFilters() {
        return this.filters;
    }

    public void setFilters(Map<String, Object> filters) {
      this.filters = filters;
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
    
    public Boolean getIsDetails() {
        return this.isDetails;
    }

    public void setIsDetails(Boolean isDetails) {
      this.isDetails = isDetails;
    }
    
    public Map<String, Object> getMetricParams() {
        return this.metricParams;
    }

    public void setMetricParams(Map<String, Object> metricParams) {
      this.metricParams = metricParams;
    }
    
    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
      this.to = to;
    }
    
}
