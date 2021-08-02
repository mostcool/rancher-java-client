package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DeploymentCondition extends AbstractType {

    @JsonProperty("lastTransitionTime")
    private String lastTransitionTime;

    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;

    @JsonProperty("message")
    private String message;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("status")
    private String status;

    @JsonProperty("type")
    private String type;
}
