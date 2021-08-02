package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class PersistentVolumeClaim extends AbstractType {

    @JsonProperty("accessModes")
    private List<String> accessModes;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("dataSource")
    private TypedLocalObjectReference dataSource;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("resources")
    private ResourceRequirements resources;

    @JsonProperty("selector")
    private LabelSelector selector;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private PersistentVolumeClaimStatus status;

    @JsonProperty("storageClassId")
    private String storageClassId;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("volumeId")
    private String volumeId;

    @JsonProperty("volumeMode")
    private String volumeMode;
}
