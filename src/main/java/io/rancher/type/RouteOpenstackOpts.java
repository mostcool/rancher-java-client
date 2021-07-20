package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RouteOpenstackOpts extends AbstractType {
    
    @JsonProperty("router-id")
    private String routerId;
    
    public String getRouterId() {
        return this.routerId;
    }

    public void setRouterId(String routerId) {
      this.routerId = routerId;
    }
    
}
