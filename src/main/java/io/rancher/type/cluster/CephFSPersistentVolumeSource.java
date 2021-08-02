package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class CephFSPersistentVolumeSource extends AbstractType {

    @JsonProperty("monitors")
    private List<String> monitors;

    @JsonProperty("path")
    private String path;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretFile")
    private String secretFile;

    @JsonProperty("secretRef")
    private SecretReference secretRef;

    @JsonProperty("user")
    private String user;
}
