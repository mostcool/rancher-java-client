package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SamlConfigTestInput extends AbstractType {
    
    @JsonProperty("finalRedirectUrl")
    private String finalRedirectUrl;
    
    public String getFinalRedirectUrl() {
        return this.finalRedirectUrl;
    }

    public void setFinalRedirectUrl(String finalRedirectUrl) {
      this.finalRedirectUrl = finalRedirectUrl;
    }
    
}
