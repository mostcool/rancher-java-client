package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PagerdutyConfig extends AbstractType {
    
    @JsonProperty("proxyUrl")
    private String proxyUrl;
    
    /**
     * required true
     */
    @JsonProperty("serviceKey")
    private String serviceKey;
    
    public String getProxyUrl() {
        return this.proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
      this.proxyUrl = proxyUrl;
    }
    
    public String getServiceKey() {
        return this.serviceKey;
    }

    public void setServiceKey(String serviceKey) {
      this.serviceKey = serviceKey;
    }
    
}
