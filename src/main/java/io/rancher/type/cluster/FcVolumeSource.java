package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class FcVolumeSource extends AbstractType {

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("lun")
    private Integer lun;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("targetWWNs")
    private List<String> targetWwns;

    @JsonProperty("wwids")
    private List<String> wwids;
}
