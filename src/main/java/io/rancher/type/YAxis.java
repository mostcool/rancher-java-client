package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class YAxis extends AbstractType {
    
    @JsonProperty("unit")
    private String unit;
    
    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
      this.unit = unit;
    }
    
}
