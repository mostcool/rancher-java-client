package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TlsOptions extends AbstractType {
    
    @JsonProperty("caCertificates")
    private String caCertificates;
    
    @JsonProperty("credentialName")
    private String credentialName;
    
    @JsonProperty("httpsRedirect")
    private Boolean httpsRedirect;
    
    @JsonProperty("mode")
    private String mode;
    
    @JsonProperty("privateKey")
    private String privateKey;
    
    @JsonProperty("serverCertificate")
    private String serverCertificate;
    
    @JsonProperty("subjectAltNames")
    private List<String> subjectAltNames;
    
    public String getCaCertificates() {
        return this.caCertificates;
    }

    public void setCaCertificates(String caCertificates) {
      this.caCertificates = caCertificates;
    }
    
    public String getCredentialName() {
        return this.credentialName;
    }

    public void setCredentialName(String credentialName) {
      this.credentialName = credentialName;
    }
    
    public Boolean getHttpsRedirect() {
        return this.httpsRedirect;
    }

    public void setHttpsRedirect(Boolean httpsRedirect) {
      this.httpsRedirect = httpsRedirect;
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
    
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    public void setServerCertificate(String serverCertificate) {
      this.serverCertificate = serverCertificate;
    }
    
    public List<String> getSubjectAltNames() {
        return this.subjectAltNames;
    }

    public void setSubjectAltNames(List<String> subjectAltNames) {
      this.subjectAltNames = subjectAltNames;
    }
    
}
