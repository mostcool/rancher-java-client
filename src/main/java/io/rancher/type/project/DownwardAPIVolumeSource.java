package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class DownwardAPIVolumeSource extends AbstractType {
    
    @JsonProperty("defaultMode")
    private Integer defaultMode;
    
    @JsonProperty("items")
    private List<DownwardAPIVolumeFile> items;
    
    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
      this.defaultMode = defaultMode;
    }
    
    public List<DownwardAPIVolumeFile> getItems() {
        return this.items;
    }

    public void setItems(List<DownwardAPIVolumeFile> items) {
      this.items = items;
    }
    
}
