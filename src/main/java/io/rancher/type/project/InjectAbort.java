package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class InjectAbort extends AbstractType {
    
    @JsonProperty("httpStatus")
    private Integer httpStatus;
    
    @JsonProperty("percent")
    private Integer percent;
    
    public Integer getHttpStatus() {
        return this.httpStatus;
    }

    public void setHttpStatus(Integer httpStatus) {
      this.httpStatus = httpStatus;
    }
    
    public Integer getPercent() {
        return this.percent;
    }

    public void setPercent(Integer percent) {
      this.percent = percent;
    }
    
}
