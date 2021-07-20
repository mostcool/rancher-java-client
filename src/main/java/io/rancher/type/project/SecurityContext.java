package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class SecurityContext extends AbstractType {
    
    @JsonProperty("allowPrivilegeEscalation")
    private Boolean allowPrivilegeEscalation;
    
    @JsonProperty("capAdd")
    private List<String> capAdd;
    
    @JsonProperty("capDrop")
    private List<String> capDrop;
    
    @JsonProperty("privileged")
    private Boolean privileged;
    
    @JsonProperty("procMount")
    private String procMount;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("runAsGroup")
    private Integer runAsGroup;
    
    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;
    
    @JsonProperty("uid")
    private Integer uid;
    
    @JsonProperty("windowsOptions")
    private WindowsSecurityContextOptions windowsOptions;
    
    public Boolean getAllowPrivilegeEscalation() {
        return this.allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
      this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }
    
    public List<String> getCapAdd() {
        return this.capAdd;
    }

    public void setCapAdd(List<String> capAdd) {
      this.capAdd = capAdd;
    }
    
    public List<String> getCapDrop() {
        return this.capDrop;
    }

    public void setCapDrop(List<String> capDrop) {
      this.capDrop = capDrop;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public String getProcMount() {
        return this.procMount;
    }

    public void setProcMount(String procMount) {
      this.procMount = procMount;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public Integer getRunAsGroup() {
        return this.runAsGroup;
    }

    public void setRunAsGroup(Integer runAsGroup) {
      this.runAsGroup = runAsGroup;
    }
    
    public Boolean getRunAsNonRoot() {
        return this.runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
      this.runAsNonRoot = runAsNonRoot;
    }
    
    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
      this.uid = uid;
    }
    
    public WindowsSecurityContextOptions getWindowsOptions() {
        return this.windowsOptions;
    }

    public void setWindowsOptions(WindowsSecurityContextOptions windowsOptions) {
      this.windowsOptions = windowsOptions;
    }
    
}
