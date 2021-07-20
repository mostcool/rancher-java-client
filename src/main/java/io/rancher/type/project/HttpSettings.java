package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class HttpSettings extends AbstractType {
    
    @JsonProperty("http1MaxPendingRequests")
    private Integer http1maxPendingRequests;
    
    @JsonProperty("http2MaxRequests")
    private Integer http2maxRequests;
    
    @JsonProperty("maxRequestsPerConnection")
    private Integer maxRequestsPerConnection;
    
    @JsonProperty("maxRetries")
    private Integer maxRetries;
    
    public Integer getHttp1maxPendingRequests() {
        return this.http1maxPendingRequests;
    }

    public void setHttp1maxPendingRequests(Integer http1maxPendingRequests) {
      this.http1maxPendingRequests = http1maxPendingRequests;
    }
    
    public Integer getHttp2maxRequests() {
        return this.http2maxRequests;
    }

    public void setHttp2maxRequests(Integer http2maxRequests) {
      this.http2maxRequests = http2maxRequests;
    }
    
    public Integer getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection;
    }

    public void setMaxRequestsPerConnection(Integer maxRequestsPerConnection) {
      this.maxRequestsPerConnection = maxRequestsPerConnection;
    }
    
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
      this.maxRetries = maxRetries;
    }
    
}
