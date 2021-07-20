package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class MemoryInfo extends AbstractType {
    
    @JsonProperty("memTotalKiB")
    private Integer memTotalKiB;
    
    public Integer getMemTotalKiB() {
        return this.memTotalKiB;
    }

    public void setMemTotalKiB(Integer memTotalKiB) {
      this.memTotalKiB = memTotalKiB;
    }
    
}
