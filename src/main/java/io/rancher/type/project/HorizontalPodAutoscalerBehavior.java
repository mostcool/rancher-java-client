package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HorizontalPodAutoscalerBehavior extends AbstractType {

    @JsonProperty("scaleDown")
    private HpaScalingRules scaleDown;

    @JsonProperty("scaleUp")
    private HpaScalingRules scaleUp;
}
