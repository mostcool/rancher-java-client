package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class CsiPersistentVolumeSource extends AbstractType {

    @JsonProperty("controllerExpandSecretRef")
    private SecretReference controllerExpandSecretRef;

    @JsonProperty("controllerPublishSecretRef")
    private SecretReference controllerPublishSecretRef;

    @JsonProperty("driver")
    private String driver;

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("nodePublishSecretRef")
    private SecretReference nodePublishSecretRef;

    @JsonProperty("nodeStageSecretRef")
    private SecretReference nodeStageSecretRef;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("volumeAttributes")
    private Map<String, Object> volumeAttributes;

    @JsonProperty("volumeHandle")
    private String volumeHandle;
}
