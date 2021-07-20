package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class IngressRule extends AbstractType {
    
    @JsonProperty("host")
    private String host;
    
    @JsonProperty("paths")
    private List<HttpIngressPath> paths;
    
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
      this.host = host;
    }
    
    public List<HttpIngressPath> getPaths() {
        return this.paths;
    }

    public void setPaths(List<HttpIngressPath> paths) {
      this.paths = paths;
    }
    
}
