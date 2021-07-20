package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockStorageOpenstackOpts extends AbstractType {
    
    @JsonProperty("bs-version")
    private String bsVersion;
    
    @JsonProperty("ignore-volume-az")
    private Boolean ignoreVolumeAz;
    
    @JsonProperty("trust-device-path")
    private Boolean trustDevicePath;
    
    public String getBsVersion() {
        return this.bsVersion;
    }

    public void setBsVersion(String bsVersion) {
      this.bsVersion = bsVersion;
    }
    
    public Boolean getIgnoreVolumeAz() {
        return this.ignoreVolumeAz;
    }

    public void setIgnoreVolumeAz(Boolean ignoreVolumeAz) {
      this.ignoreVolumeAz = ignoreVolumeAz;
    }
    
    public Boolean getTrustDevicePath() {
        return this.trustDevicePath;
    }

    public void setTrustDevicePath(Boolean trustDevicePath) {
      this.trustDevicePath = trustDevicePath;
    }
    
}
