package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StorageOSPersistentVolumeSource extends AbstractType {

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretRef")
    private ObjectReference secretRef;

    @JsonProperty("volumeName")
    private String volumeName;

    @JsonProperty("volumeNamespace")
    private String volumeNamespace;
}
