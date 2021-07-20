package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GcePersistentDiskVolumeSource extends AbstractType {
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("partition")
    private Integer partition;
    
    @JsonProperty("pdName")
    private String pdName;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public Integer getPartition() {
        return this.partition;
    }

    public void setPartition(Integer partition) {
      this.partition = partition;
    }
    
    public String getPdName() {
        return this.pdName;
    }

    public void setPdName(String pdName) {
      this.pdName = pdName;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
}
