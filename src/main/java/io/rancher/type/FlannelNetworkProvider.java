package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class FlannelNetworkProvider extends AbstractType {
    
    @JsonProperty("iface")
    private String iface;
    
    public String getIface() {
        return this.iface;
    }

    public void setIface(String iface) {
      this.iface = iface;
    }
    
}
