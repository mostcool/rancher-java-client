package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class NodeDriver extends AbstractType {

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("builtin")
    private Boolean builtin;

    @JsonProperty("checksum")
    private String checksum;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private NodeDriverStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uiUrl")
    private String uiUrl;

    /**
     * required true
     */
    @JsonProperty("url")
    private String url;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("whitelistDomains")
    private List<String> whitelistDomains;
}
