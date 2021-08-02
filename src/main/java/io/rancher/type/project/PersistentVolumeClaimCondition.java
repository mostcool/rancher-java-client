package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PersistentVolumeClaimCondition extends AbstractType {

    @JsonProperty("lastProbeTime")
    private String lastProbeTime;

    @JsonProperty("lastTransitionTime")
    private String lastTransitionTime;

    @JsonProperty("message")
    private String message;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("status")
    private String status;

    @JsonProperty("type")
    private String type;
}
