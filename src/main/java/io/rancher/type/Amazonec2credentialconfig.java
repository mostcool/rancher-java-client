package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Amazonec2credentialconfig extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("accessKey")
    private String accessKey;
    
    /**
     * required true
     */
    @JsonProperty("secretKey")
    private String secretKey;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
      this.secretKey = secretKey;
    }
    
}
