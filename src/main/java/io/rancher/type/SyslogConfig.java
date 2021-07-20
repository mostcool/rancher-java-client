package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SyslogConfig extends AbstractType {
    
    @JsonProperty("certificate")
    private String certificate;
    
    @JsonProperty("clientCert")
    private String clientCert;
    
    @JsonProperty("clientKey")
    private String clientKey;
    
    @JsonProperty("enableTls")
    private Boolean enableTls;
    
    /**
     * required true
     */
    @JsonProperty("endpoint")
    private String endpoint;
    
    @JsonProperty("program")
    private String program;
    
    @JsonProperty("protocol")
    private String protocol;
    
    @JsonProperty("severity")
    private String severity;
    
    @JsonProperty("sslVerify")
    private Boolean sslVerify;
    
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
    
    public Boolean getEnableTls() {
        return this.enableTls;
    }

    public void setEnableTls(Boolean enableTls) {
      this.enableTls = enableTls;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
      this.program = program;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String severity) {
      this.severity = severity;
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
