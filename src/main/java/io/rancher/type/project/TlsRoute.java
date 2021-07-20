package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TlsRoute extends AbstractType {
    
    @JsonProperty("match")
    private List<TlsMatchAttributes> match;
    
    @JsonProperty("route")
    private List<HttpRouteDestination> route;
    
    public List<TlsMatchAttributes> getMatch() {
        return this.match;
    }

    public void setMatch(List<TlsMatchAttributes> match) {
      this.match = match;
    }
    
    public List<HttpRouteDestination> getRoute() {
        return this.route;
    }

    public void setRoute(List<HttpRouteDestination> route) {
      this.route = route;
    }
    
}
