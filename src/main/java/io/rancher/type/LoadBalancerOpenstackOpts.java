package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class LoadBalancerOpenstackOpts extends AbstractType {
    
    @JsonProperty("create-monitor")
    private Boolean createMonitor;
    
    @JsonProperty("floating-network-id")
    private String floatingNetworkId;
    
    @JsonProperty("lb-method")
    private String lbMethod;
    
    @JsonProperty("lb-provider")
    private String lbProvider;
    
    @JsonProperty("lb-version")
    private String lbVersion;
    
    @JsonProperty("manage-security-groups")
    private Boolean manageSecurityGroups;
    
    @JsonProperty("monitor-delay")
    private String monitorDelay;
    
    @JsonProperty("monitor-max-retries")
    private Integer monitorMaxRetries;
    
    @JsonProperty("monitor-timeout")
    private String monitorTimeout;
    
    @JsonProperty("subnet-id")
    private String subnetId;
    
    @JsonProperty("use-octavia")
    private Boolean useOctavia;
    
    public Boolean getCreateMonitor() {
        return this.createMonitor;
    }

    public void setCreateMonitor(Boolean createMonitor) {
      this.createMonitor = createMonitor;
    }
    
    public String getFloatingNetworkId() {
        return this.floatingNetworkId;
    }

    public void setFloatingNetworkId(String floatingNetworkId) {
      this.floatingNetworkId = floatingNetworkId;
    }
    
    public String getLbMethod() {
        return this.lbMethod;
    }

    public void setLbMethod(String lbMethod) {
      this.lbMethod = lbMethod;
    }
    
    public String getLbProvider() {
        return this.lbProvider;
    }

    public void setLbProvider(String lbProvider) {
      this.lbProvider = lbProvider;
    }
    
    public String getLbVersion() {
        return this.lbVersion;
    }

    public void setLbVersion(String lbVersion) {
      this.lbVersion = lbVersion;
    }
    
    public Boolean getManageSecurityGroups() {
        return this.manageSecurityGroups;
    }

    public void setManageSecurityGroups(Boolean manageSecurityGroups) {
      this.manageSecurityGroups = manageSecurityGroups;
    }
    
    public String getMonitorDelay() {
        return this.monitorDelay;
    }

    public void setMonitorDelay(String monitorDelay) {
      this.monitorDelay = monitorDelay;
    }
    
    public Integer getMonitorMaxRetries() {
        return this.monitorMaxRetries;
    }

    public void setMonitorMaxRetries(Integer monitorMaxRetries) {
      this.monitorMaxRetries = monitorMaxRetries;
    }
    
    public String getMonitorTimeout() {
        return this.monitorTimeout;
    }

    public void setMonitorTimeout(String monitorTimeout) {
      this.monitorTimeout = monitorTimeout;
    }
    
    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
      this.subnetId = subnetId;
    }
    
    public Boolean getUseOctavia() {
        return this.useOctavia;
    }

    public void setUseOctavia(Boolean useOctavia) {
      this.useOctavia = useOctavia;
    }
    
}
