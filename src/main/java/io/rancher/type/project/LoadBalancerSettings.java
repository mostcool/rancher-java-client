package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class LoadBalancerSettings extends AbstractType {
    
    @JsonProperty("consistentHash")
    private ConsistentHashLB consistentHash;
    
    @JsonProperty("simple")
    private String simple;
    
    public ConsistentHashLB getConsistentHash() {
        return this.consistentHash;
    }

    public void setConsistentHash(ConsistentHashLB consistentHash) {
      this.consistentHash = consistentHash;
    }
    
    public String getSimple() {
        return this.simple;
    }

    public void setSimple(String simple) {
      this.simple = simple;
    }
    
}
