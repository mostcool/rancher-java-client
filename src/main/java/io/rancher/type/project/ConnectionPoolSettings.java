package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ConnectionPoolSettings extends AbstractType {
    
    @JsonProperty("http")
    private HttpSettings http;
    
    @JsonProperty("tcp")
    private TcpSettings tcp;
    
    public HttpSettings getHttp() {
        return this.http;
    }

    public void setHttp(HttpSettings http) {
      this.http = http;
    }
    
    public TcpSettings getTcp() {
        return this.tcp;
    }

    public void setTcp(TcpSettings tcp) {
      this.tcp = tcp;
    }
    
}
