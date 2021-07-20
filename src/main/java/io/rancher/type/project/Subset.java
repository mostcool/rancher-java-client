package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class Subset extends AbstractType {
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("trafficPolicy")
    private TrafficPolicy trafficPolicy;
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public TrafficPolicy getTrafficPolicy() {
        return this.trafficPolicy;
    }

    public void setTrafficPolicy(TrafficPolicy trafficPolicy) {
      this.trafficPolicy = trafficPolicy;
    }
    
}
