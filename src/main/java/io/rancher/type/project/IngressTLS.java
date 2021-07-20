package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class IngressTLS extends AbstractType {
    
    @JsonProperty("certificateId")
    private String certificateId;
    
    @JsonProperty("hosts")
    private List<String> hosts;
    
    public String getCertificateId() {
        return this.certificateId;
    }

    public void setCertificateId(String certificateId) {
      this.certificateId = certificateId;
    }
    
    public List<String> getHosts() {
        return this.hosts;
    }

    public void setHosts(List<String> hosts) {
      this.hosts = hosts;
    }
    
}
