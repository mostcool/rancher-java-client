package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NfsVolumeSource extends AbstractType {

    @JsonProperty("path")
    private String path;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("server")
    private String server;
}
