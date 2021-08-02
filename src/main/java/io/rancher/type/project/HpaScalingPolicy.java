package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HpaScalingPolicy extends AbstractType {

    @JsonProperty("periodSeconds")
    private Integer periodSeconds;

    @JsonProperty("type")
    private String type;

    @JsonProperty("value")
    private Integer value;
}
