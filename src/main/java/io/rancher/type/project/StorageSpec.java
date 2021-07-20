package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StorageSpec extends AbstractType {
    
    @JsonProperty("emptyDir")
    private EmptyDirVolumeSource emptyDir;
    
    @JsonProperty("volumeClaimTemplate")
    private PersistentVolumeClaim volumeClaimTemplate;
    
    public EmptyDirVolumeSource getEmptyDir() {
        return this.emptyDir;
    }

    public void setEmptyDir(EmptyDirVolumeSource emptyDir) {
      this.emptyDir = emptyDir;
    }
    
    public PersistentVolumeClaim getVolumeClaimTemplate() {
        return this.volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(PersistentVolumeClaim volumeClaimTemplate) {
      this.volumeClaimTemplate = volumeClaimTemplate;
    }
    
}
