package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class MetadataOpenstackOpts extends AbstractType {
    
    @JsonProperty("request-timeout")
    private Integer requestTimeout;
    
    @JsonProperty("search-order")
    private String searchOrder;
    
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public void setRequestTimeout(Integer requestTimeout) {
      this.requestTimeout = requestTimeout;
    }
    
    public String getSearchOrder() {
        return this.searchOrder;
    }

    public void setSearchOrder(String searchOrder) {
      this.searchOrder = searchOrder;
    }
    
}
