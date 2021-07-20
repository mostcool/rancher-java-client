package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class RemoteReadSpec extends AbstractType {
    
    @JsonProperty("basicAuth")
    private BasicAuth basicAuth;
    
    @JsonProperty("bearerToken")
    private String bearerToken;
    
    @JsonProperty("bearerTokenFile")
    private String bearerTokenFile;
    
    @JsonProperty("proxyUrl")
    private String proxyUrl;
    
    @JsonProperty("readRecent")
    private Boolean readRecent;
    
    @JsonProperty("remoteTimeout")
    private String remoteTimeout;
    
    @JsonProperty("requiredMatchers")
    private Map<String, Object> requiredMatchers;
    
    @JsonProperty("tlsConfig")
    private TlsConfig tlsConfig;
    
    @JsonProperty("url")
    private String url;
    
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
    
    public Boolean getReadRecent() {
        return this.readRecent;
    }

    public void setReadRecent(Boolean readRecent) {
      this.readRecent = readRecent;
    }
    
    public String getRemoteTimeout() {
        return this.remoteTimeout;
    }

    public void setRemoteTimeout(String remoteTimeout) {
      this.remoteTimeout = remoteTimeout;
    }
    
    public Map<String, Object> getRequiredMatchers() {
        return this.requiredMatchers;
    }

    public void setRequiredMatchers(Map<String, Object> requiredMatchers) {
      this.requiredMatchers = requiredMatchers;
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
    
}
