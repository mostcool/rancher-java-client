package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Handler extends AbstractType {
    
    @JsonProperty("command")
    private List<String> command;
    
    @JsonProperty("host")
    private String host;
    
    @JsonProperty("httpHeaders")
    private List<HttpHeader> httpHeaders;
    
    @JsonProperty("path")
    private String path;
    
    @JsonProperty("port")
    private Integer port;
    
    @JsonProperty("scheme")
    private String scheme;
    
    @JsonProperty("tcp")
    private Boolean tcp;
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
      this.host = host;
    }
    
    public List<HttpHeader> getHttpHeaders() {
        return this.httpHeaders;
    }

    public void setHttpHeaders(List<HttpHeader> httpHeaders) {
      this.httpHeaders = httpHeaders;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
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
    
    public Boolean getTcp() {
        return this.tcp;
    }

    public void setTcp(Boolean tcp) {
      this.tcp = tcp;
    }
    
}
