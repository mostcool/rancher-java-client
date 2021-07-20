package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class EmptyDirVolumeSource extends AbstractType {
    
    @JsonProperty("medium")
    private String medium;
    
    @JsonProperty("sizeLimit")
    private String sizeLimit;
    
    public String getMedium() {
        return this.medium;
    }

    public void setMedium(String medium) {
      this.medium = medium;
    }
    
    public String getSizeLimit() {
        return this.sizeLimit;
    }

    public void setSizeLimit(String sizeLimit) {
      this.sizeLimit = sizeLimit;
    }
    
}
