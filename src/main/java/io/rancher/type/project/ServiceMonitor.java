package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ServiceMonitor extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("endpoints")
    private List<Endpoint> endpoints;

    @JsonProperty("jobLabel")
    private String jobLabel;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("namespaceSelector")
    private List<String> namespaceSelector;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("podTargetLabels")
    private List<String> podTargetLabels;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("sampleLimit")
    private Integer sampleLimit;

    @JsonProperty("selector")
    private LabelSelector selector;

    @JsonProperty("targetLabels")
    private List<String> targetLabels;

    @JsonProperty("targetService")
    private String targetService;

    @JsonProperty("targetWorkload")
    private String targetWorkload;

    @JsonProperty("uuid")
    private String uuid;
}
