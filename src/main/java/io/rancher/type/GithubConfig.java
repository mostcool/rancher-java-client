package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class GithubConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("accessMode")
    private String accessMode;

    @JsonProperty("additionalClientIds")
    private Map<String, Object> additionalClientIds;

    @JsonProperty("allowedPrincipalIds")
    private List<String> allowedPrincipalIds;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    /**
     * required true
     */
    @JsonProperty("clientId")
    private String clientId;

    /**
     * required true
     */
    @JsonProperty("clientSecret")
    private String clientSecret;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("hostnameToClientId")
    private Map<String, Object> hostnameToClientId;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("tls")
    private Boolean tls;

    @JsonProperty("type")
    private String type;

    @JsonProperty("uuid")
    private String uuid;
}
