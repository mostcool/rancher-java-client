package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class QueryClusterGraphOutput extends AbstractType {
    
    @JsonProperty("data")
    private List<QueryClusterGraph> data;
    
    @JsonProperty("type")
    private String type;
    
    public List<QueryClusterGraph> getData() {
        return this.data;
    }

    public void setData(List<QueryClusterGraph> data) {
      this.data = data;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}
