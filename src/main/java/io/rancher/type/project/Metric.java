package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Metric extends AbstractType {
    
    @JsonProperty("current")
    private MetricValueStatus current;
    
    @JsonProperty("describedObject")
    private CrossVersionObjectReference describedObject;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("selector")
    private LabelSelector selector;
    
    @JsonProperty("target")
    private MetricTarget target;
    
    @JsonProperty("type")
    private String type;
    
    public MetricValueStatus getCurrent() {
        return this.current;
    }

    public void setCurrent(MetricValueStatus current) {
      this.current = current;
    }
    
    public CrossVersionObjectReference getDescribedObject() {
        return this.describedObject;
    }

    public void setDescribedObject(CrossVersionObjectReference describedObject) {
      this.describedObject = describedObject;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public LabelSelector getSelector() {
        return this.selector;
    }

    public void setSelector(LabelSelector selector) {
      this.selector = selector;
    }
    
    public MetricTarget getTarget() {
        return this.target;
    }

    public void setTarget(MetricTarget target) {
      this.target = target;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}
