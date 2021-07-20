package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class NetworkVshpereOpts extends AbstractType {
    
    @JsonProperty("public-network")
    private String publicNetwork;
    
    public String getPublicNetwork() {
        return this.publicNetwork;
    }

    public void setPublicNetwork(String publicNetwork) {
      this.publicNetwork = publicNetwork;
    }
    
}
