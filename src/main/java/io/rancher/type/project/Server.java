package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Server extends AbstractType {
    
    @JsonProperty("hosts")
    private List<String> hosts;
    
    @JsonProperty("port")
    private Port port;
    
    @JsonProperty("tls")
    private TlsOptions tls;
    
    public List<String> getHosts() {
        return this.hosts;
    }

    public void setHosts(List<String> hosts) {
      this.hosts = hosts;
    }
    
    public Port getPort() {
        return this.port;
    }

    public void setPort(Port port) {
      this.port = port;
    }
    
    public TlsOptions getTls() {
        return this.tls;
    }

    public void setTls(TlsOptions tls) {
      this.tls = tls;
    }
    
}
