package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PortTrafficPolicy extends AbstractType {
    
    @JsonProperty("connectionPool")
    private ConnectionPoolSettings connectionPool;
    
    @JsonProperty("loadBalancer")
    private LoadBalancerSettings loadBalancer;
    
    @JsonProperty("outlierDetection")
    private OutlierDetection outlierDetection;
    
    @JsonProperty("port")
    private PortSelector port;
    
    @JsonProperty("tls")
    private TlsSettings tls;
    
    public ConnectionPoolSettings getConnectionPool() {
        return this.connectionPool;
    }

    public void setConnectionPool(ConnectionPoolSettings connectionPool) {
      this.connectionPool = connectionPool;
    }
    
    public LoadBalancerSettings getLoadBalancer() {
        return this.loadBalancer;
    }

    public void setLoadBalancer(LoadBalancerSettings loadBalancer) {
      this.loadBalancer = loadBalancer;
    }
    
    public OutlierDetection getOutlierDetection() {
        return this.outlierDetection;
    }

    public void setOutlierDetection(OutlierDetection outlierDetection) {
      this.outlierDetection = outlierDetection;
    }
    
    public PortSelector getPort() {
        return this.port;
    }

    public void setPort(PortSelector port) {
      this.port = port;
    }
    
    public TlsSettings getTls() {
        return this.tls;
    }

    public void setTls(TlsSettings tls) {
      this.tls = tls;
    }
    
}
