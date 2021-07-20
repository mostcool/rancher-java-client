package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class HttpFaultInjection extends AbstractType {
    
    @JsonProperty("abort")
    private InjectAbort abort;
    
    @JsonProperty("delay")
    private InjectDelay delay;
    
    public InjectAbort getAbort() {
        return this.abort;
    }

    public void setAbort(InjectAbort abort) {
      this.abort = abort;
    }
    
    public InjectDelay getDelay() {
        return this.delay;
    }

    public void setDelay(InjectDelay delay) {
      this.delay = delay;
    }
    
}
