package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ProjectedVolumeSource extends AbstractType {

    @JsonProperty("defaultMode")
    private Integer defaultMode;

    @JsonProperty("sources")
    private List<VolumeProjection> sources;
}
