package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class VsphereVirtualDiskVolumeSource extends AbstractType {

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("storagePolicyID")
    private String storagePolicyId;

    @JsonProperty("storagePolicyName")
    private String storagePolicyName;

    @JsonProperty("volumePath")
    private String volumePath;
}
