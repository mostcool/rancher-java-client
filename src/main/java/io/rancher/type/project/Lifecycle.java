package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Lifecycle extends AbstractType {
    
    @JsonProperty("postStart")
    private Handler postStart;
    
    @JsonProperty("preStop")
    private Handler preStop;
    
    public Handler getPostStart() {
        return this.postStart;
    }

    public void setPostStart(Handler postStart) {
      this.postStart = postStart;
    }
    
    public Handler getPreStop() {
        return this.preStop;
    }

    public void setPreStop(Handler preStop) {
      this.preStop = preStop;
    }
    
}
