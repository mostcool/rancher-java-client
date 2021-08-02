package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class DaemonSetStatus extends AbstractType {

    @JsonProperty("collisionCount")
    private Integer collisionCount;

    @JsonProperty("conditions")
    private List<DaemonSetCondition> conditions;

    @JsonProperty("currentNumberScheduled")
    private Integer currentNumberScheduled;

    @JsonProperty("desiredNumberScheduled")
    private Integer desiredNumberScheduled;

    @JsonProperty("numberAvailable")
    private Integer numberAvailable;

    @JsonProperty("numberMisscheduled")
    private Integer numberMisscheduled;

    @JsonProperty("numberReady")
    private Integer numberReady;

    @JsonProperty("numberUnavailable")
    private Integer numberUnavailable;

    @JsonProperty("observedGeneration")
    private Integer observedGeneration;

    @JsonProperty("updatedNumberScheduled")
    private Integer updatedNumberScheduled;
}
