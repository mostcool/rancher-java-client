package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class StorageClass extends AbstractType {

    @JsonProperty("allowVolumeExpansion")
    private Boolean allowVolumeExpansion;

    @JsonProperty("allowedTopologies")
    private List<TopologySelectorTerm> allowedTopologies;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("mountOptions")
    private List<String> mountOptions;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("parameters")
    private Map<String, Object> parameters;

    @JsonProperty("provisioner")
    private String provisioner;

    @JsonProperty("reclaimPolicy")
    private String reclaimPolicy;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("volumeBindingMode")
    private String volumeBindingMode;
}
