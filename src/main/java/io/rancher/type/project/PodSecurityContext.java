package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PodSecurityContext extends AbstractType {
    
    @JsonProperty("fsGroupChangePolicy")
    private String fsGroupChangePolicy;
    
    @JsonProperty("fsgid")
    private Integer fsgid;
    
    @JsonProperty("gids")
    private List<Integer> gids;
    
    @JsonProperty("runAsGroup")
    private Integer runAsGroup;
    
    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;
    
    @JsonProperty("sysctls")
    private List<Sysctl> sysctls;
    
    @JsonProperty("uid")
    private Integer uid;
    
    @JsonProperty("windowsOptions")
    private WindowsSecurityContextOptions windowsOptions;
    
    public String getFsGroupChangePolicy() {
        return this.fsGroupChangePolicy;
    }

    public void setFsGroupChangePolicy(String fsGroupChangePolicy) {
      this.fsGroupChangePolicy = fsGroupChangePolicy;
    }
    
    public Integer getFsgid() {
        return this.fsgid;
    }

    public void setFsgid(Integer fsgid) {
      this.fsgid = fsgid;
    }
    
    public List<Integer> getGids() {
        return this.gids;
    }

    public void setGids(List<Integer> gids) {
      this.gids = gids;
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
    
    public List<Sysctl> getSysctls() {
        return this.sysctls;
    }

    public void setSysctls(List<Sysctl> sysctls) {
      this.sysctls = sysctls;
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
