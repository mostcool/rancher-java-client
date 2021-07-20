package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class HttpRouteDestination extends AbstractType {
    
    @JsonProperty("destination")
    private Destination destination;
    
    @JsonProperty("headers")
    private Headers headers;
    
    @JsonProperty("weight")
    private Integer weight;
    
    public Destination getDestination() {
        return this.destination;
    }

    public void setDestination(Destination destination) {
      this.destination = destination;
    }
    
    public Headers getHeaders() {
        return this.headers;
    }

    public void setHeaders(Headers headers) {
      this.headers = headers;
    }
    
    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
      this.weight = weight;
    }
    
}
