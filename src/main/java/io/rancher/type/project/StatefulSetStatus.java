package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class StatefulSetStatus extends AbstractType {

    @JsonProperty("collisionCount")
    private Integer collisionCount;

    @JsonProperty("conditions")
    private List<StatefulSetCondition> conditions;

    @JsonProperty("currentReplicas")
    private Integer currentReplicas;

    @JsonProperty("currentRevision")
    private String currentRevision;

    @JsonProperty("observedGeneration")
    private Integer observedGeneration;

    @JsonProperty("readyReplicas")
    private Integer readyReplicas;

    @JsonProperty("replicas")
    private Integer replicas;

    @JsonProperty("updateRevision")
    private String updateRevision;

    @JsonProperty("updatedReplicas")
    private Integer updatedReplicas;
}
