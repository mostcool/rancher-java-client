package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class AlertmanagerEndpoints extends AbstractType {
    
    @JsonProperty("apiVersion")
    private String apiVersion;
    
    @JsonProperty("bearerTokenFile")
    private String bearerTokenFile;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespace")
    private String namespace;
    
    @JsonProperty("pathPrefix")
    private String pathPrefix;
    
    @JsonProperty("port")
    private Integer port;
    
    @JsonProperty("scheme")
    private String scheme;
    
    @JsonProperty("tlsConfig")
    private TlsConfig tlsConfig;
    
    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
    }
    
    public String getBearerTokenFile() {
        return this.bearerTokenFile;
    }

    public void setBearerTokenFile(String bearerTokenFile) {
      this.bearerTokenFile = bearerTokenFile;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
      this.namespace = namespace;
    }
    
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public void setPathPrefix(String pathPrefix) {
      this.pathPrefix = pathPrefix;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String scheme) {
      this.scheme = scheme;
    }
    
    public TlsConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public void setTlsConfig(TlsConfig tlsConfig) {
      this.tlsConfig = tlsConfig;
    }
    
}
