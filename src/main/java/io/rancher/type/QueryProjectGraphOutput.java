package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class QueryProjectGraphOutput extends AbstractType {
    
    @JsonProperty("data")
    private List<QueryProjectGraph> data;
    
    @JsonProperty("type")
    private String type;
    
    public List<QueryProjectGraph> getData() {
        return this.data;
    }

    public void setData(List<QueryProjectGraph> data) {
      this.data = data;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}
