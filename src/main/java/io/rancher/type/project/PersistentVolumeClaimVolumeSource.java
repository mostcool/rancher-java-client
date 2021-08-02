package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PersistentVolumeClaimVolumeSource extends AbstractType {

    @JsonProperty("persistentVolumeClaimId")
    private String persistentVolumeClaimId;

    @JsonProperty("readOnly")
    private Boolean readOnly;
}
