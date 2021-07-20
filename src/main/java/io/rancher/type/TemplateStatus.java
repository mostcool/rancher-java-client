package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class TemplateStatus extends AbstractType {
    
    @JsonProperty("helmVersion")
    private String helmVersion;
    
    public String getHelmVersion() {
        return this.helmVersion;
    }

    public void setHelmVersion(String helmVersion) {
      this.helmVersion = helmVersion;
    }
    
}
