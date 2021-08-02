package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class GlobalRole extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("builtin")
    private Boolean builtin;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

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
    @JsonProperty("newUserDefault")
    private Boolean newUserDefault;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("rules")
    private List<PolicyRule> rules;

    @JsonProperty("uuid")
    private String uuid;
}
