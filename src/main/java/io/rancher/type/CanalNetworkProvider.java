package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CanalNetworkProvider extends AbstractType {
    
    @JsonProperty("iface")
    private String iface;
    
    public String getIface() {
        return this.iface;
    }

    public void setIface(String iface) {
      this.iface = iface;
    }
    
}
