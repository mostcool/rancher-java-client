package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class FlockerVolumeSource extends AbstractType {
    
    @JsonProperty("datasetName")
    private String datasetName;
    
    @JsonProperty("datasetUUID")
    private String datasetUuid;
    
    public String getDatasetName() {
        return this.datasetName;
    }

    public void setDatasetName(String datasetName) {
      this.datasetName = datasetName;
    }
    
    public String getDatasetUuid() {
        return this.datasetUuid;
    }

    public void setDatasetUuid(String datasetUuid) {
      this.datasetUuid = datasetUuid;
    }
    
}
