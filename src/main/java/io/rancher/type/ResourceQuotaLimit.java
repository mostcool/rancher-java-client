package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ResourceQuotaLimit extends AbstractType {
    
    @JsonProperty("configMaps")
    private String configMaps;
    
    @JsonProperty("limitsCpu")
    private String limitsCpu;
    
    @JsonProperty("limitsMemory")
    private String limitsMemory;
    
    @JsonProperty("persistentVolumeClaims")
    private String persistentVolumeClaims;
    
    @JsonProperty("pods")
    private String pods;
    
    @JsonProperty("replicationControllers")
    private String replicationControllers;
    
    @JsonProperty("requestsCpu")
    private String requestsCpu;
    
    @JsonProperty("requestsMemory")
    private String requestsMemory;
    
    @JsonProperty("requestsStorage")
    private String requestsStorage;
    
    @JsonProperty("secrets")
    private String secrets;
    
    @JsonProperty("services")
    private String services;
    
    @JsonProperty("servicesLoadBalancers")
    private String servicesLoadBalancers;
    
    @JsonProperty("servicesNodePorts")
    private String servicesNodePorts;
    
    public String getConfigMaps() {
        return this.configMaps;
    }

    public void setConfigMaps(String configMaps) {
      this.configMaps = configMaps;
    }
    
    public String getLimitsCpu() {
        return this.limitsCpu;
    }

    public void setLimitsCpu(String limitsCpu) {
      this.limitsCpu = limitsCpu;
    }
    
    public String getLimitsMemory() {
        return this.limitsMemory;
    }

    public void setLimitsMemory(String limitsMemory) {
      this.limitsMemory = limitsMemory;
    }
    
    public String getPersistentVolumeClaims() {
        return this.persistentVolumeClaims;
    }

    public void setPersistentVolumeClaims(String persistentVolumeClaims) {
      this.persistentVolumeClaims = persistentVolumeClaims;
    }
    
    public String getPods() {
        return this.pods;
    }

    public void setPods(String pods) {
      this.pods = pods;
    }
    
    public String getReplicationControllers() {
        return this.replicationControllers;
    }

    public void setReplicationControllers(String replicationControllers) {
      this.replicationControllers = replicationControllers;
    }
    
    public String getRequestsCpu() {
        return this.requestsCpu;
    }

    public void setRequestsCpu(String requestsCpu) {
      this.requestsCpu = requestsCpu;
    }
    
    public String getRequestsMemory() {
        return this.requestsMemory;
    }

    public void setRequestsMemory(String requestsMemory) {
      this.requestsMemory = requestsMemory;
    }
    
    public String getRequestsStorage() {
        return this.requestsStorage;
    }

    public void setRequestsStorage(String requestsStorage) {
      this.requestsStorage = requestsStorage;
    }
    
    public String getSecrets() {
        return this.secrets;
    }

    public void setSecrets(String secrets) {
      this.secrets = secrets;
    }
    
    public String getServices() {
        return this.services;
    }

    public void setServices(String services) {
      this.services = services;
    }
    
    public String getServicesLoadBalancers() {
        return this.servicesLoadBalancers;
    }

    public void setServicesLoadBalancers(String servicesLoadBalancers) {
      this.servicesLoadBalancers = servicesLoadBalancers;
    }
    
    public String getServicesNodePorts() {
        return this.servicesNodePorts;
    }

    public void setServicesNodePorts(String servicesNodePorts) {
      this.servicesNodePorts = servicesNodePorts;
    }
    
}
