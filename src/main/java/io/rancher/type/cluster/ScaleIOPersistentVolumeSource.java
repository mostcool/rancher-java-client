package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ScaleIOPersistentVolumeSource extends AbstractType {

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("gateway")
    private String gateway;

    @JsonProperty("protectionDomain")
    private String protectionDomain;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretRef")
    private SecretReference secretRef;

    @JsonProperty("sslEnabled")
    private Boolean sslEnabled;

    @JsonProperty("storageMode")
    private String storageMode;

    @JsonProperty("storagePool")
    private String storagePool;

    @JsonProperty("system")
    private String system;

    @JsonProperty("volumeName")
    private String volumeName;
}
