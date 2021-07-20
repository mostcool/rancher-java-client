package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class AzureDiskVolumeSource extends AbstractType {
    
    @JsonProperty("cachingMode")
    private String cachingMode;
    
    @JsonProperty("diskName")
    private String diskName;
    
    @JsonProperty("diskURI")
    private String diskUri;
    
    @JsonProperty("fsType")
    private String fsType;
    
    @JsonProperty("kind")
    private String kind;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    public String getCachingMode() {
        return this.cachingMode;
    }

    public void setCachingMode(String cachingMode) {
      this.cachingMode = cachingMode;
    }
    
    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
      this.diskName = diskName;
    }
    
    public String getDiskUri() {
        return this.diskUri;
    }

    public void setDiskUri(String diskUri) {
      this.diskUri = diskUri;
    }
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
}
