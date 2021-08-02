package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class HorizontalPodAutoscaler extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("behavior")
    private HorizontalPodAutoscalerBehavior behavior;

    @JsonProperty("conditions")
    private List<HorizontalPodAutoscalerCondition> conditions;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("currentReplicas")
    private Integer currentReplicas;

    @JsonProperty("description")
    private String description;

    @JsonProperty("desiredReplicas")
    private Integer desiredReplicas;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("lastScaleTime")
    private String lastScaleTime;

    /**
     * required true
     */
    @JsonProperty("maxReplicas")
    private Integer maxReplicas;

    @JsonProperty("metrics")
    private List<Metric> metrics;

    @JsonProperty("minReplicas")
    private Integer minReplicas;

    @JsonProperty("name")
    private String name;

    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("observedGeneration")
    private Integer observedGeneration;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("state")
    private String state;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    /**
     * required true
     */
    @JsonProperty("workloadId")
    private String workloadId;
}
