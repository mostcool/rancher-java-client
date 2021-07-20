package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class TargetSystemService extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("condition")
    private String condition;
    
    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
      this.condition = condition;
    }
    
}
