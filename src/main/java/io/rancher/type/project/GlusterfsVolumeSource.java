package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GlusterfsVolumeSource extends AbstractType {

    @JsonProperty("endpoints")
    private String endpoints;

    @JsonProperty("path")
    private String path;

    @JsonProperty("readOnly")
    private Boolean readOnly;
}
