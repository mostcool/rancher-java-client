package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Port extends AbstractType {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("number")
    private Integer number;
    
    @JsonProperty("protocol")
    private String protocol;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
      this.number = number;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
}
