package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class VolumeMount extends AbstractType {
    
    /**
     * required true
     */
    @JsonProperty("mountPath")
    private String mountPath;
    
    @JsonProperty("mountPropagation")
    private String mountPropagation;
    
    /**
     * required true
     */
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("subPath")
    private String subPath;
    
    @JsonProperty("subPathExpr")
    private String subPathExpr;
    
    public String getMountPath() {
        return this.mountPath;
    }

    public void setMountPath(String mountPath) {
      this.mountPath = mountPath;
    }
    
    public String getMountPropagation() {
        return this.mountPropagation;
    }

    public void setMountPropagation(String mountPropagation) {
      this.mountPropagation = mountPropagation;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getSubPath() {
        return this.subPath;
    }

    public void setSubPath(String subPath) {
      this.subPath = subPath;
    }
    
    public String getSubPathExpr() {
        return this.subPathExpr;
    }

    public void setSubPathExpr(String subPathExpr) {
      this.subPathExpr = subPathExpr;
    }
    
}
