package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ApiServiceCondition extends AbstractType {

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
