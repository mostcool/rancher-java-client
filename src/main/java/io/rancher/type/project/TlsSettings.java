package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TlsSettings extends AbstractType {
    
    @JsonProperty("caCertificates")
    private String caCertificates;
    
    @JsonProperty("clientCertificate")
    private String clientCertificate;
    
    @JsonProperty("mode")
    private String mode;
    
    @JsonProperty("privateKey")
    private String privateKey;
    
    @JsonProperty("sni")
    private String sni;
    
    @JsonProperty("subjectAltNames")
    private List<String> subjectAltNames;
    
    public String getCaCertificates() {
        return this.caCertificates;
    }

    public void setCaCertificates(String caCertificates) {
      this.caCertificates = caCertificates;
    }
    
    public String getClientCertificate() {
        return this.clientCertificate;
    }

    public void setClientCertificate(String clientCertificate) {
      this.clientCertificate = clientCertificate;
    }
    
    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
      this.mode = mode;
    }
    
    public String getPrivateKey() {
        return this.privateKey;
    }

    public void setPrivateKey(String privateKey) {
      this.privateKey = privateKey;
    }
    
    public String getSni() {
        return this.sni;
    }

    public void setSni(String sni) {
      this.sni = sni;
    }
    
    public List<String> getSubjectAltNames() {
        return this.subjectAltNames;
    }

    public void setSubjectAltNames(List<String> subjectAltNames) {
      this.subjectAltNames = subjectAltNames;
    }
    
}
