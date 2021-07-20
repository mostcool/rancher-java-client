package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Target extends AbstractType {
    
    @JsonProperty("appId")
    private String appId;
    
    @JsonProperty("healthState")
    private String healthState;
    
    /**
     * required true
     */
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("state")
    private String state;
    
    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
      this.appId = appId;
    }
    
    public String getHealthState() {
        return this.healthState;
    }

    public void setHealthState(String healthState) {
      this.healthState = healthState;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
}
