package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CertExpiration extends AbstractType {
    
    @JsonProperty("expirationDate")
    private String expirationDate;
    
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
      this.expirationDate = expirationDate;
    }
    
}
