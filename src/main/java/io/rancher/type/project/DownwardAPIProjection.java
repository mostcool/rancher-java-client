package io.rancher.type.project;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class DownwardAPIProjection extends AbstractType {
    
    @JsonProperty("items")
    private List<DownwardAPIVolumeFile> items;
    
    public List<DownwardAPIVolumeFile> getItems() {
        return this.items;
    }

    public void setItems(List<DownwardAPIVolumeFile> items) {
      this.items = items;
    }
    
}
