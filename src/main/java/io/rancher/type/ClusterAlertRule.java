package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ClusterAlertRule extends AbstractType {

    @JsonProperty("alertState")
    private String alertState;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("clusterScanRule")
    private ClusterScanRule clusterScanRule;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("eventRule")
    private EventRule eventRule;

    @JsonProperty("groupId")
    private String groupId;

    /**
     * required true
     */
    @JsonProperty("groupIntervalSeconds")
    private Integer groupIntervalSeconds;

    /**
     * required true
     */
    @JsonProperty("groupWaitSeconds")
    private Integer groupWaitSeconds;

    @JsonProperty("inherited")
    private Boolean inherited;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("metricRule")
    private MetricRule metricRule;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("nodeRule")
    private NodeRule nodeRule;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    /**
     * required true
     */
    @JsonProperty("repeatIntervalSeconds")
    private Integer repeatIntervalSeconds;

    /**
     * required true
     */
    @JsonProperty("severity")
    private String severity;

    @JsonProperty("state")
    private String state;

    @JsonProperty("systemServiceRule")
    private SystemServiceRule systemServiceRule;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;
}
