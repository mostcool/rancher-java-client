package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ScheduledClusterScan extends AbstractType {
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    @JsonProperty("scanConfig")
    private ClusterScanConfig scanConfig;
    
    @JsonProperty("scheduleConfig")
    private ScheduledClusterScanConfig scheduleConfig;
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public ClusterScanConfig getScanConfig() {
        return this.scanConfig;
    }

    public void setScanConfig(ClusterScanConfig scanConfig) {
      this.scanConfig = scanConfig;
    }
    
    public ScheduledClusterScanConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public void setScheduleConfig(ScheduledClusterScanConfig scheduleConfig) {
      this.scheduleConfig = scheduleConfig;
    }
    
}
