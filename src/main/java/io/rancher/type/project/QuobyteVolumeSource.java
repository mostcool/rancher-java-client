package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class QuobyteVolumeSource extends AbstractType {

    @JsonProperty("group")
    private String group;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("registry")
    private String registry;

    @JsonProperty("tenant")
    private String tenant;

    @JsonProperty("user")
    private String user;

    @JsonProperty("volume")
    private String volume;
}
