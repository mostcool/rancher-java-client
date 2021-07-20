package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TlsConfig extends AbstractType {
    
    @JsonProperty("ca")
    private SecretOrConfigMap ca;
    
    @JsonProperty("caFile")
    private String caFile;
    
    @JsonProperty("cert")
    private SecretOrConfigMap cert;
    
    @JsonProperty("certFile")
    private String certFile;
    
    @JsonProperty("insecureSkipVerify")
    private Boolean insecureSkipVerify;
    
    @JsonProperty("keyFile")
    private String keyFile;
    
    @JsonProperty("keySecret")
    private SecretKeySelector keySecret;
    
    @JsonProperty("serverName")
    private String serverName;
    
    public SecretOrConfigMap getCa() {
        return this.ca;
    }

    public void setCa(SecretOrConfigMap ca) {
      this.ca = ca;
    }
    
    public String getCaFile() {
        return this.caFile;
    }

    public void setCaFile(String caFile) {
      this.caFile = caFile;
    }
    
    public SecretOrConfigMap getCert() {
        return this.cert;
    }

    public void setCert(SecretOrConfigMap cert) {
      this.cert = cert;
    }
    
    public String getCertFile() {
        return this.certFile;
    }

    public void setCertFile(String certFile) {
      this.certFile = certFile;
    }
    
    public Boolean getInsecureSkipVerify() {
        return this.insecureSkipVerify;
    }

    public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
      this.insecureSkipVerify = insecureSkipVerify;
    }
    
    public String getKeyFile() {
        return this.keyFile;
    }

    public void setKeyFile(String keyFile) {
      this.keyFile = keyFile;
    }
    
    public SecretKeySelector getKeySecret() {
        return this.keySecret;
    }

    public void setKeySecret(SecretKeySelector keySecret) {
      this.keySecret = keySecret;
    }
    
    public String getServerName() {
        return this.serverName;
    }

    public void setServerName(String serverName) {
      this.serverName = serverName;
    }
    
}
