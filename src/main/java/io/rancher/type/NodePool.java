package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class NodePool extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    /**
     * required true
     */
    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("controlPlane")
    private Boolean controlPlane;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("deleteNotReadyAfterSecs")
    private Integer deleteNotReadyAfterSecs;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("driver")
    private String driver;

    @JsonProperty("etcd")
    private Boolean etcd;

    /**
     * required true
     */
    @JsonProperty("hostnamePrefix")
    private String hostnamePrefix;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("nodeAnnotations")
    private Map<String, Object> nodeAnnotations;

    @JsonProperty("nodeLabels")
    private Map<String, Object> nodeLabels;

    @JsonProperty("nodeTaints")
    private List<Taint> nodeTaints;

    /**
     * required true
     */
    @JsonProperty("nodeTemplateId")
    private String nodeTemplateId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    /**
     * required true
     */
    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private NodePoolStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("worker")
    private Boolean worker;
}
