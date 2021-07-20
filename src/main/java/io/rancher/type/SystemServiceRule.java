package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemServiceRule extends AbstractType {
    
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
