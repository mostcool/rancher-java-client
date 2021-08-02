package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class DeploymentStatus extends AbstractType {

    @JsonProperty("availableReplicas")
    private Integer availableReplicas;

    @JsonProperty("collisionCount")
    private Integer collisionCount;

    @JsonProperty("conditions")
    private List<DeploymentCondition> conditions;

    @JsonProperty("observedGeneration")
    private Integer observedGeneration;

    @JsonProperty("readyReplicas")
    private Integer readyReplicas;

    @JsonProperty("replicas")
    private Integer replicas;

    @JsonProperty("unavailableReplicas")
    private Integer unavailableReplicas;

    @JsonProperty("updatedReplicas")
    private Integer updatedReplicas;
}
