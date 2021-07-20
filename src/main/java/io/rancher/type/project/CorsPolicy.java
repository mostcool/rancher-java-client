package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class CorsPolicy extends AbstractType {
    
    @JsonProperty("allowCredentials")
    private Boolean allowCredentials;
    
    @JsonProperty("allowHeaders")
    private List<String> allowHeaders;
    
    @JsonProperty("allowMethods")
    private List<String> allowMethods;
    
    @JsonProperty("allowOrigin")
    private List<String> allowOrigin;
    
    @JsonProperty("exposeHeaders")
    private List<String> exposeHeaders;
    
    @JsonProperty("maxAge")
    private String maxAge;
    
    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    public void setAllowCredentials(Boolean allowCredentials) {
      this.allowCredentials = allowCredentials;
    }
    
    public List<String> getAllowHeaders() {
        return this.allowHeaders;
    }

    public void setAllowHeaders(List<String> allowHeaders) {
      this.allowHeaders = allowHeaders;
    }
    
    public List<String> getAllowMethods() {
        return this.allowMethods;
    }

    public void setAllowMethods(List<String> allowMethods) {
      this.allowMethods = allowMethods;
    }
    
    public List<String> getAllowOrigin() {
        return this.allowOrigin;
    }

    public void setAllowOrigin(List<String> allowOrigin) {
      this.allowOrigin = allowOrigin;
    }
    
    public List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }

    public void setExposeHeaders(List<String> exposeHeaders) {
      this.exposeHeaders = exposeHeaders;
    }
    
    public String getMaxAge() {
        return this.maxAge;
    }

    public void setMaxAge(String maxAge) {
      this.maxAge = maxAge;
    }
    
}
