package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ElasticsearchConfig extends AbstractType {
    
    @JsonProperty("authPassword")
    private String authPassword;
    
    @JsonProperty("authUsername")
    private String authUsername;
    
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
    @JsonProperty("dateFormat")
    private String dateFormat;
    
    /**
     * required true
     */
    @JsonProperty("endpoint")
    private String endpoint;
    
    /**
     * required true
     */
    @JsonProperty("indexPrefix")
    private String indexPrefix;
    
    @JsonProperty("sslVerify")
    private Boolean sslVerify;
    
    @JsonProperty("sslVersion")
    private String sslVersion;
    
    public String getAuthPassword() {
        return this.authPassword;
    }

    public void setAuthPassword(String authPassword) {
      this.authPassword = authPassword;
    }
    
    public String getAuthUsername() {
        return this.authUsername;
    }

    public void setAuthUsername(String authUsername) {
      this.authUsername = authUsername;
    }
    
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
    
    public String getDateFormat() {
        return this.dateFormat;
    }

    public void setDateFormat(String dateFormat) {
      this.dateFormat = dateFormat;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getIndexPrefix() {
        return this.indexPrefix;
    }

    public void setIndexPrefix(String indexPrefix) {
      this.indexPrefix = indexPrefix;
    }
    
    public Boolean getSslVerify() {
        return this.sslVerify;
    }

    public void setSslVerify(Boolean sslVerify) {
      this.sslVerify = sslVerify;
    }
    
    public String getSslVersion() {
        return this.sslVersion;
    }

    public void setSslVersion(String sslVersion) {
      this.sslVersion = sslVersion;
    }
    
}
