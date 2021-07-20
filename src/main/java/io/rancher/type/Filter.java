package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class Filter extends AbstractType {
    
    @JsonProperty("modifiers")
    private List<String> modifiers;
    
    public List<String> getModifiers() {
        return this.modifiers;
    }

    public void setModifiers(List<String> modifiers) {
      this.modifiers = modifiers;
    }
    
}
