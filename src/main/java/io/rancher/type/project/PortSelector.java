package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class PortSelector extends AbstractType {
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("number")
    private Integer number;
    
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
    
}
