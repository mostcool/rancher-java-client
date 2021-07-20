package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class RemoteWriteSpec extends AbstractType {
    
    @JsonProperty("basicAuth")
    private BasicAuth basicAuth;
    
    @JsonProperty("bearerToken")
    private String bearerToken;
    
    @JsonProperty("bearerTokenFile")
    private String bearerTokenFile;
    
    @JsonProperty("proxyUrl")
    private String proxyUrl;
    
    @JsonProperty("queueConfig")
    private QueueConfig queueConfig;
    
    @JsonProperty("remoteTimeout")
    private String remoteTimeout;
    
    @JsonProperty("tlsConfig")
    private TlsConfig tlsConfig;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("writeRelabelConfigs")
    private List<RelabelConfig> writeRelabelConfigs;
    
    public BasicAuth getBasicAuth() {
        return this.basicAuth;
    }

    public void setBasicAuth(BasicAuth basicAuth) {
      this.basicAuth = basicAuth;
    }
    
    public String getBearerToken() {
        return this.bearerToken;
    }

    public void setBearerToken(String bearerToken) {
      this.bearerToken = bearerToken;
    }
    
    public String getBearerTokenFile() {
        return this.bearerTokenFile;
    }

    public void setBearerTokenFile(String bearerTokenFile) {
      this.bearerTokenFile = bearerTokenFile;
    }
    
    public String getProxyUrl() {
        return this.proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
      this.proxyUrl = proxyUrl;
    }
    
    public QueueConfig getQueueConfig() {
        return this.queueConfig;
    }

    public void setQueueConfig(QueueConfig queueConfig) {
      this.queueConfig = queueConfig;
    }
    
    public String getRemoteTimeout() {
        return this.remoteTimeout;
    }

    public void setRemoteTimeout(String remoteTimeout) {
      this.remoteTimeout = remoteTimeout;
    }
    
    public TlsConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public void setTlsConfig(TlsConfig tlsConfig) {
      this.tlsConfig = tlsConfig;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public List<RelabelConfig> getWriteRelabelConfigs() {
        return this.writeRelabelConfigs;
    }

    public void setWriteRelabelConfigs(List<RelabelConfig> writeRelabelConfigs) {
      this.writeRelabelConfigs = writeRelabelConfigs;
    }
    
}
