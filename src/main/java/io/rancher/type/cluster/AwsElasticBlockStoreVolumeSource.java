package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AwsElasticBlockStoreVolumeSource extends AbstractType {

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("partition")
    private Integer partition;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("volumeID")
    private String volumeId;
}
