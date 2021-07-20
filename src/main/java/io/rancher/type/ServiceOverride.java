package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ServiceOverride extends AbstractType {
    
    @JsonProperty("region")
    private String region;
    
    @JsonProperty("service")
    private String service;
    
    @JsonProperty("signing-method")
    private String signingMethod;
    
    @JsonProperty("signing-name")
    private String signingName;
    
    @JsonProperty("signing-region")
    private String signingRegion;
    
    @JsonProperty("url")
    private String url;
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getService() {
        return this.service;
    }

    public void setService(String service) {
      this.service = service;
    }
    
    public String getSigningMethod() {
        return this.signingMethod;
    }

    public void setSigningMethod(String signingMethod) {
      this.signingMethod = signingMethod;
    }
    
    public String getSigningName() {
        return this.signingName;
    }

    public void setSigningName(String signingName) {
      this.signingName = signingName;
    }
    
    public String getSigningRegion() {
        return this.signingRegion;
    }

    public void setSigningRegion(String signingRegion) {
      this.signingRegion = signingRegion;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
