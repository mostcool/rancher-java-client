package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class HttpCookie extends AbstractType {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("path")
    private String path;
    
    @JsonProperty("ttl")
    private String ttl;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public String getTtl() {
        return this.ttl;
    }

    public void setTtl(String ttl) {
      this.ttl = ttl;
    }
    
}
