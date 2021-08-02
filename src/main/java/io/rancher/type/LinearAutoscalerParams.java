package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LinearAutoscalerParams extends AbstractType {

    @JsonProperty("coresPerReplica")
    private Float coresPerReplica;

    @JsonProperty("max")
    private Integer max;

    @JsonProperty("min")
    private Integer min;

    @JsonProperty("nodesPerReplica")
    private Float nodesPerReplica;

    @JsonProperty("preventSinglePointFailure")
    private Boolean preventSinglePointFailure;
}
