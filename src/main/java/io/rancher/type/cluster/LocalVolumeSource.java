package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LocalVolumeSource extends AbstractType {

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("path")
    private String path;
}