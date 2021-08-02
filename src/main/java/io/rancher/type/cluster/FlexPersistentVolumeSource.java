package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class FlexPersistentVolumeSource extends AbstractType {

    @JsonProperty("driver")
    private String driver;

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("options")
    private Map<String, Object> options;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretRef")
    private SecretReference secretRef;
}
