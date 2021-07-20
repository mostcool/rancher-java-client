package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class HttpRewrite extends AbstractType {
    
    @JsonProperty("authority")
    private String authority;
    
    @JsonProperty("uri")
    private String uri;
    
    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
      this.authority = authority;
    }
    
    public String getUri() {
        return this.uri;
    }

    public void setUri(String uri) {
      this.uri = uri;
    }
    
}
