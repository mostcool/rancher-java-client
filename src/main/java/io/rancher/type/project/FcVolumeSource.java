package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class FcVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("lun")
    private Integer lun;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("targetWWNs")
    private List<String> targetWwns;
    
    @JsonProperty("wwids")
    private List<String> wwids;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public Integer getLun() {
        return this.lun;
    }

    public void setLun(Integer lun) {
      this.lun = lun;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public List<String> getTargetWwns() {
        return this.targetWwns;
    }

    public void setTargetWwns(List<String> targetWwns) {
      this.targetWwns = targetWwns;
    }
    
    public List<String> getWwids() {
        return this.wwids;
    }

    public void setWwids(List<String> wwids) {
      this.wwids = wwids;
    }
    
}
