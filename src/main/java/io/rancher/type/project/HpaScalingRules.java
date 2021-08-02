package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class HpaScalingRules extends AbstractType {

    @JsonProperty("policies")
    private List<HpaScalingPolicy> policies;

    @JsonProperty("selectPolicy")
    private String selectPolicy;

    @JsonProperty("stabilizationWindowSeconds")
    private Integer stabilizationWindowSeconds;
}
