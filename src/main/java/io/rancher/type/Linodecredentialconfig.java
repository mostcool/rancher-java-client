package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Linodecredentialconfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("token")
    private String token;
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
}
