package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class CronJobStatus extends AbstractType {
    
    @JsonProperty("active")
    private List<ObjectReference> active;
    
    @JsonProperty("lastScheduleTime")
    private String lastScheduleTime;
    
    public List<ObjectReference> getActive() {
        return this.active;
    }

    public void setActive(List<ObjectReference> active) {
      this.active = active;
    }
    
    public String getLastScheduleTime() {
        return this.lastScheduleTime;
    }

    public void setLastScheduleTime(String lastScheduleTime) {
      this.lastScheduleTime = lastScheduleTime;
    }
    
}
