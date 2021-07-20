package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class RotateCertificateInput extends AbstractType {
    
    @JsonProperty("caCertificates")
    private Boolean caCertificates;
    
    @JsonProperty("services")
    private String services;
    
    public Boolean getCaCertificates() {
        return this.caCertificates;
    }

    public void setCaCertificates(Boolean caCertificates) {
      this.caCertificates = caCertificates;
    }
    
    public String getServices() {
        return this.services;
    }

    public void setServices(String services) {
      this.services = services;
    }
    
}
