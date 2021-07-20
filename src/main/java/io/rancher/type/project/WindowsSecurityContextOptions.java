package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class WindowsSecurityContextOptions extends AbstractType {
    
    @JsonProperty("gmsaCredentialSpec")
    private String gmsaCredentialSpec;
    
    @JsonProperty("gmsaCredentialSpecName")
    private String gmsaCredentialSpecName;
    
    @JsonProperty("runAsUserName")
    private String runAsUserName;
    
    public String getGmsaCredentialSpec() {
        return this.gmsaCredentialSpec;
    }

    public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
      this.gmsaCredentialSpec = gmsaCredentialSpec;
    }
    
    public String getGmsaCredentialSpecName() {
        return this.gmsaCredentialSpecName;
    }

    public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
      this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    }
    
    public String getRunAsUserName() {
        return this.runAsUserName;
    }

    public void setRunAsUserName(String runAsUserName) {
      this.runAsUserName = runAsUserName;
    }
    
}
