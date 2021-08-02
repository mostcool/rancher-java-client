package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class DynamicSchema extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("collectionActions")
    private Map<String, Object> collectionActions;

    @JsonProperty("collectionFields")
    private Map<String, Object> collectionFields;

    @JsonProperty("collectionFilters")
    private Map<String, Object> collectionFilters;

    @JsonProperty("collectionMethods")
    private List<String> collectionMethods;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("dynamicSchemaVersion")
    private String dynamicSchemaVersion;

    @JsonProperty("embed")
    private Boolean embed;

    @JsonProperty("embedType")
    private String embedType;

    @JsonProperty("includeableLinks")
    private List<String> includeableLinks;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("pluralName")
    private String pluralName;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("resourceActions")
    private Map<String, Object> resourceActions;

    @JsonProperty("resourceFields")
    private Map<String, Object> resourceFields;

    @JsonProperty("resourceMethods")
    private List<String> resourceMethods;

    @JsonProperty("schemaName")
    private String schemaName;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private DynamicSchemaStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;
}
