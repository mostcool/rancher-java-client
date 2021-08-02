package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ClusterAlert extends AbstractType {

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

    /**
     * required true
     */
    @JsonProperty("displayName")
    private String displayName;

    /**
     * required true
     */
    @JsonProperty("initialWaitSeconds")
    private Integer initialWaitSeconds;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    /**
     * required true
     */
    @JsonProperty("recipients")
    private List<Recipient> recipients;

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

    @JsonProperty("status")
    private AlertStatus status;

    @JsonProperty("targetEvent")
    private TargetEvent targetEvent;

    @JsonProperty("targetNode")
    private TargetNode targetNode;

    @JsonProperty("targetSystemService")
    private TargetSystemService targetSystemService;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;
}
