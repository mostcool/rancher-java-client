package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class TrafficPolicy extends AbstractType {
    
    @JsonProperty("connectionPool")
    private ConnectionPoolSettings connectionPool;
    
    @JsonProperty("loadBalancer")
    private LoadBalancerSettings loadBalancer;
    
    @JsonProperty("outlierDetection")
    private OutlierDetection outlierDetection;
    
    @JsonProperty("portLevelSettings")
    private List<PortTrafficPolicy> portLevelSettings;
    
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
    
    public List<PortTrafficPolicy> getPortLevelSettings() {
        return this.portLevelSettings;
    }

    public void setPortLevelSettings(List<PortTrafficPolicy> portLevelSettings) {
      this.portLevelSettings = portLevelSettings;
    }
    
    public TlsSettings getTls() {
        return this.tls;
    }

    public void setTls(TlsSettings tls) {
      this.tls = tls;
    }
    
}
