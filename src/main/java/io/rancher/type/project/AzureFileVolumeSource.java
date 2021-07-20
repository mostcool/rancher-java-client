package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class AzureFileVolumeSource extends AbstractType {
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("secretName")
    private String secretName;
    
    @JsonProperty("shareName")
    private String shareName;
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getSecretName() {
        return this.secretName;
    }

    public void setSecretName(String secretName) {
      this.secretName = secretName;
    }
    
    public String getShareName() {
        return this.shareName;
    }

    public void setShareName(String shareName) {
      this.shareName = shareName;
    }
    
}
