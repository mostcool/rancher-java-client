package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class GoogleOauthConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("accessMode")
    private String accessMode;

    /**
     * required true
     */
    @JsonProperty("adminEmail")
    private String adminEmail;

    @JsonProperty("allowedPrincipalIds")
    private List<String> allowedPrincipalIds;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * required true
     */
    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nestedGroupMembershipEnabled")
    private Boolean nestedGroupMembershipEnabled;

    /**
     * required true
     */
    @JsonProperty("oauthCredential")
    private String oauthCredential;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    /**
     * required true
     */
    @JsonProperty("serviceAccountCredential")
    private String serviceAccountCredential;

    @JsonProperty("type")
    private String type;

    /**
     * required true
     */
    @JsonProperty("userInfoEndpoint")
    private String userInfoEndpoint;

    @JsonProperty("uuid")
    private String uuid;
}
