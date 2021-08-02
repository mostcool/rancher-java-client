package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ClusterMonitorGraph extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("detailsMetricsSelector")
    private Map<String, Object> detailsMetricsSelector;

    @JsonProperty("displayResourceType")
    private String displayResourceType;

    @JsonProperty("graphType")
    private String graphType;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("metricsSelector")
    private Map<String, Object> metricsSelector;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("resourceType")
    private String resourceType;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("yAxis")
    private YAxis yaxis;
}
