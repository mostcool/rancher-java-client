package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CinderPersistentVolumeSource extends AbstractType {

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretRef")
    private SecretReference secretRef;

    @JsonProperty("volumeID")
    private String volumeId;
}
