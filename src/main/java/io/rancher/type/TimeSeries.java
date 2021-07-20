package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TimeSeries extends AbstractType {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("points")
    private List<List<Float>> points;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<List<Float>> getPoints() {
        return this.points;
    }

    public void setPoints(List<List<Float>> points) {
      this.points = points;
    }
    
}
