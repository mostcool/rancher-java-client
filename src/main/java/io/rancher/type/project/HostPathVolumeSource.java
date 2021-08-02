package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HostPathVolumeSource extends AbstractType {

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("path")
    private String path;
}
