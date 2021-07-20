package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class QueryClusterGraph extends AbstractType {
    
    @JsonProperty("graphID")
    private String graphId;
    
    @JsonProperty("series")
    private List<String> series;
    
    public String getGraphId() {
        return this.graphId;
    }

    public void setGraphId(String graphId) {
      this.graphId = graphId;
    }
    
    public List<String> getSeries() {
        return this.series;
    }

    public void setSeries(List<String> series) {
      this.series = series;
    }
    
}
