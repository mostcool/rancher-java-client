package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class TcpRoute extends AbstractType {
    
    @JsonProperty("match")
    private List<L4MatchAttributes> match;
    
    @JsonProperty("route")
    private List<HttpRouteDestination> route;
    
    public List<L4MatchAttributes> getMatch() {
        return this.match;
    }

    public void setMatch(List<L4MatchAttributes> match) {
      this.match = match;
    }
    
    public List<HttpRouteDestination> getRoute() {
        return this.route;
    }

    public void setRoute(List<HttpRouteDestination> route) {
      this.route = route;
    }
    
}
