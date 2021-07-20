package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CatalogRefresh extends AbstractType {
    
    @JsonProperty("catalogs")
    private List<String> catalogs;
    
    public List<String> getCatalogs() {
        return this.catalogs;
    }

    public void setCatalogs(List<String> catalogs) {
      this.catalogs = catalogs;
    }
    
}
