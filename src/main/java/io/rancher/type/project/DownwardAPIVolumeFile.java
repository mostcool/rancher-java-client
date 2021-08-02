package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DownwardAPIVolumeFile extends AbstractType {

    @JsonProperty("fieldRef")
    private ObjectFieldSelector fieldRef;

    @JsonProperty("mode")
    private Integer mode;

    @JsonProperty("path")
    private String path;

    @JsonProperty("resourceFieldRef")
    private ResourceFieldSelector resourceFieldRef;
}
