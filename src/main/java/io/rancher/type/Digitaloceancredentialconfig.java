package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Digitaloceancredentialconfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("accessToken")
    private String accessToken;
    
    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
    }
    
}
