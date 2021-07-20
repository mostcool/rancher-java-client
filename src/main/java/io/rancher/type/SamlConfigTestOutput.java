package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class SamlConfigTestOutput extends AbstractType {
    
    @JsonProperty("idpRedirectUrl")
    private String idpRedirectUrl;
    
    public String getIdpRedirectUrl() {
        return this.idpRedirectUrl;
    }

    public void setIdpRedirectUrl(String idpRedirectUrl) {
      this.idpRedirectUrl = idpRedirectUrl;
    }
    
}
