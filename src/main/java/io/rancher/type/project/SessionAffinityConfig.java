package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SessionAffinityConfig extends AbstractType {
    
    @JsonProperty("clientIP")
    private ClientIPConfig clientIp;
    
    public ClientIPConfig getClientIp() {
        return this.clientIp;
    }

    public void setClientIp(ClientIPConfig clientIp) {
      this.clientIp = clientIp;
    }
    
}
