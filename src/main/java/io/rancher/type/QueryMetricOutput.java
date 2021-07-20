package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class QueryMetricOutput extends AbstractType {
    
    @JsonProperty("series")
    private List<String> series;
    
    @JsonProperty("type")
    private String type;
    
    public List<String> getSeries() {
        return this.series;
    }

    public void setSeries(List<String> series) {
      this.series = series;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}
