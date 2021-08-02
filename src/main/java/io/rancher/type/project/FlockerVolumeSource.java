package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FlockerVolumeSource extends AbstractType {

    @JsonProperty("datasetName")
    private String datasetName;

    @JsonProperty("datasetUUID")
    private String datasetUuid;
}
