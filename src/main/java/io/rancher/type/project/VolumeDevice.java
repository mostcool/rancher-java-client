package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class VolumeDevice extends AbstractType {
    
    @JsonProperty("devicePath")
    private String devicePath;
    
    @JsonProperty("name")
    private String name;
    
    public String getDevicePath() {
        return this.devicePath;
    }

    public void setDevicePath(String devicePath) {
      this.devicePath = devicePath;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
