package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class DynamicSchemaStatus extends AbstractType {
    
    @JsonProperty("fake")
    private String fake;
    
    public String getFake() {
        return this.fake;
    }

    public void setFake(String fake) {
      this.fake = fake;
    }
    
}
