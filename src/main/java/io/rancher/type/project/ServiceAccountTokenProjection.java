package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ServiceAccountTokenProjection extends AbstractType {
    
    @JsonProperty("audience")
    private String audience;
    
    @JsonProperty("expirationSeconds")
    private Integer expirationSeconds;
    
    @JsonProperty("path")
    private String path;
    
    public String getAudience() {
        return this.audience;
    }

    public void setAudience(String audience) {
      this.audience = audience;
    }
    
    public Integer getExpirationSeconds() {
        return this.expirationSeconds;
    }

    public void setExpirationSeconds(Integer expirationSeconds) {
      this.expirationSeconds = expirationSeconds;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
}
