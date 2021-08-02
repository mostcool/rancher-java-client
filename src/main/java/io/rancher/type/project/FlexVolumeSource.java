package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class FlexVolumeSource extends AbstractType {

    @JsonProperty("driver")
    private String driver;

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("options")
    private Map<String, Object> options;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretRef")
    private LocalObjectReference secretRef;
}
