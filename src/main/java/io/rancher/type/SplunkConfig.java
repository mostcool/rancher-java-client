package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SplunkConfig extends AbstractType {
    
    @JsonProperty("certificate")
    private String certificate;
    
    @JsonProperty("clientCert")
    private String clientCert;
    
    @JsonProperty("clientKey")
    private String clientKey;
    
    @JsonProperty("clientKeyPass")
    private String clientKeyPass;
    
    /**
     * required true
     */
    @JsonProperty("endpoint")
    private String endpoint;
    
    @JsonProperty("index")
    private String index;
    
    @JsonProperty("source")
    private String source;
    
    @JsonProperty("sslVerify")
    private Boolean sslVerify;
    
    /**
     * required true
     */
    @JsonProperty("token")
    private String token;
    
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
    
    public String getClientKeyPass() {
        return this.clientKeyPass;
    }

    public void setClientKeyPass(String clientKeyPass) {
      this.clientKeyPass = clientKeyPass;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getIndex() {
        return this.index;
    }

    public void setIndex(String index) {
      this.index = index;
    }
    
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
      this.source = source;
    }
    
    public Boolean getSslVerify() {
        return this.sslVerify;
    }

    public void setSslVerify(Boolean sslVerify) {
      this.sslVerify = sslVerify;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
}
