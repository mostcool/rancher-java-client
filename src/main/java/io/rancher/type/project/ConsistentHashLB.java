package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class ConsistentHashLB extends AbstractType {
    
    @JsonProperty("httpCookie")
    private HttpCookie httpCookie;
    
    @JsonProperty("httpHeaderName")
    private String httpHeaderName;
    
    @JsonProperty("minimumRingSize")
    private Integer minimumRingSize;
    
    @JsonProperty("useSourceIp")
    private Boolean useSourceIp;
    
    public HttpCookie getHttpCookie() {
        return this.httpCookie;
    }

    public void setHttpCookie(HttpCookie httpCookie) {
      this.httpCookie = httpCookie;
    }
    
    public String getHttpHeaderName() {
        return this.httpHeaderName;
    }

    public void setHttpHeaderName(String httpHeaderName) {
      this.httpHeaderName = httpHeaderName;
    }
    
    public Integer getMinimumRingSize() {
        return this.minimumRingSize;
    }

    public void setMinimumRingSize(Integer minimumRingSize) {
      this.minimumRingSize = minimumRingSize;
    }
    
    public Boolean getUseSourceIp() {
        return this.useSourceIp;
    }

    public void setUseSourceIp(Boolean useSourceIp) {
      this.useSourceIp = useSourceIp;
    }
    
}
