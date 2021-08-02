package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ReplicaSetStatus extends AbstractType {

    @JsonProperty("availableReplicas")
    private Integer availableReplicas;

    @JsonProperty("conditions")
    private List<ReplicaSetCondition> conditions;

    @JsonProperty("fullyLabeledReplicas")
    private Integer fullyLabeledReplicas;

    @JsonProperty("observedGeneration")
    private Integer observedGeneration;

    @JsonProperty("readyReplicas")
    private Integer readyReplicas;

    @JsonProperty("replicas")
    private Integer replicas;
}
