package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class ProjectedVolumeSource extends AbstractType {
    
    @JsonProperty("defaultMode")
    private Integer defaultMode;
    
    @JsonProperty("sources")
    private List<VolumeProjection> sources;
    
    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
      this.defaultMode = defaultMode;
    }
    
    public List<VolumeProjection> getSources() {
        return this.sources;
    }

    public void setSources(List<VolumeProjection> sources) {
      this.sources = sources;
    }
    
}
