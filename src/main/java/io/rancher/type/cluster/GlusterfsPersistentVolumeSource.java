package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GlusterfsPersistentVolumeSource extends AbstractType {

    @JsonProperty("endpoints")
    private String endpoints;

    @JsonProperty("endpointsNamespace")
    private String endpointsNamespace;

    @JsonProperty("path")
    private String path;

    @JsonProperty("readOnly")
    private Boolean readOnly;
}
