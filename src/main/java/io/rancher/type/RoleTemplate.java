package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class RoleTemplate extends AbstractType {

    @JsonProperty("administrative")
    private Boolean administrative;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("builtin")
    private Boolean builtin;

    /**
     * required true
     */
    @JsonProperty("clusterCreatorDefault")
    private Boolean clusterCreatorDefault;

    @JsonProperty("context")
    private String context;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("external")
    private Boolean external;

    @JsonProperty("hidden")
    private Boolean hidden;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("locked")
    private Boolean locked;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    /**
     * required true
     */
    @JsonProperty("projectCreatorDefault")
    private Boolean projectCreatorDefault;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("roleTemplateIds")
    private List<String> roleTemplateIds;

    @JsonProperty("rules")
    private List<PolicyRule> rules;

    @JsonProperty("uuid")
    private String uuid;
}
