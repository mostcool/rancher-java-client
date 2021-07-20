package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class MetricNamesOutput extends AbstractType {
    
    @JsonProperty("names")
    private List<String> names;
    
    @JsonProperty("type")
    private String type;
    
    public List<String> getNames() {
        return this.names;
    }

    public void setNames(List<String> names) {
      this.names = names;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}
