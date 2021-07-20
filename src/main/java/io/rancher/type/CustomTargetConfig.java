package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class CustomTargetConfig extends AbstractType {
    
    @JsonProperty("certificate")
    private String certificate;
    
    @JsonProperty("clientCert")
    private String clientCert;
    
    @JsonProperty("clientKey")
    private String clientKey;
    
    @JsonProperty("content")
    private String content;
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public String getClientCert() {
        return this.clientCert;
    }

    public void setClientCert(String clientCert) {
      this.clientCert = clientCert;
    }
    
    public String getClientKey() {
        return this.clientKey;
    }

    public void setClientKey(String clientKey) {
      this.clientKey = clientKey;
    }
    
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
      this.content = content;
    }
    
}
