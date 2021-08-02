package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class GlobalDns extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    /**
     * required true
     */
    @JsonProperty("fqdn")
    private String fqdn;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("members")
    private List<Member> members;

    @JsonProperty("multiClusterAppId")
    private String multiClusterAppId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("projectIds")
    private List<String> projectIds;

    /**
     * required true
     */
    @JsonProperty("providerId")
    private String providerId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private GlobalDnsStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("ttl")
    private Integer ttl;

    @JsonProperty("uuid")
    private String uuid;
}
