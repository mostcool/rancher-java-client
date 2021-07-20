package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Headers extends AbstractType {
    
    @JsonProperty("request")
    private HeaderOperations request;
    
    @JsonProperty("response")
    private HeaderOperations response;
    
    public HeaderOperations getRequest() {
        return this.request;
    }

    public void setRequest(HeaderOperations request) {
      this.request = request;
    }
    
    public HeaderOperations getResponse() {
        return this.response;
    }

    public void setResponse(HeaderOperations response) {
      this.response = response;
    }
    
}
