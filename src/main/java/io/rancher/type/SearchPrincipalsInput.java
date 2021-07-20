package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchPrincipalsInput extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("principalType")
    private String principalType;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getPrincipalType() {
        return this.principalType;
    }

    public void setPrincipalType(String principalType) {
      this.principalType = principalType;
    }
    
}
