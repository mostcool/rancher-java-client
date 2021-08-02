package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class IscsiPersistentVolumeSource extends AbstractType {

    @JsonProperty("chapAuthDiscovery")
    private Boolean chapAuthDiscovery;

    @JsonProperty("chapAuthSession")
    private Boolean chapAuthSession;

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("initiatorName")
    private String initiatorName;

    @JsonProperty("iqn")
    private String iqn;

    @JsonProperty("iscsiInterface")
    private String iscsiInterface;

    @JsonProperty("lun")
    private Integer lun;

    @JsonProperty("portals")
    private List<String> portals;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretRef")
    private SecretReference secretRef;

    @JsonProperty("targetPortal")
    private String targetPortal;
}
