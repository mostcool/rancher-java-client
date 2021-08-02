package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Token extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("authProvider")
    private String authProvider;

    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("current")
    private Boolean current;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("expired")
    private Boolean expired;

    @JsonProperty("expiresAt")
    private String expiresAt;

    @JsonProperty("groupPrincipals")
    private List<String> groupPrincipals;

    @JsonProperty("isDerived")
    private Boolean isDerived;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("providerInfo")
    private Map<String, Object> providerInfo;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("token")
    private String token;

    @JsonProperty("ttl")
    private Integer ttl;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("userPrincipal")
    private String userPrincipal;

    @JsonProperty("uuid")
    private String uuid;
}
