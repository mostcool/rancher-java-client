package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ScheduledClusterScanConfig extends AbstractType {
    
    @JsonProperty("cronSchedule")
    private String cronSchedule;
    
    @JsonProperty("retention")
    private Integer retention;
    
    public String getCronSchedule() {
        return this.cronSchedule;
    }

    public void setCronSchedule(String cronSchedule) {
      this.cronSchedule = cronSchedule;
    }
    
    public Integer getRetention() {
        return this.retention;
    }

    public void setRetention(Integer retention) {
      this.retention = retention;
    }
    
}
