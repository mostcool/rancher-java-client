package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class DiskVsphereOpts extends AbstractType {
    
    @JsonProperty("scsicontrollertype")
    private String scsicontrollertype;
    
    public String getScsicontrollertype() {
        return this.scsicontrollertype;
    }

    public void setScsicontrollertype(String scsicontrollertype) {
      this.scsicontrollertype = scsicontrollertype;
    }
    
}
