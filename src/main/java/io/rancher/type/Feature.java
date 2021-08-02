package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Feature extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private FeatureStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    /**
     * required true
     */
    @JsonProperty("value")
    private Boolean value;
}
