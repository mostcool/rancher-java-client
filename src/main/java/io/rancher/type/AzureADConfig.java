package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class AzureADConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("accessMode")
    private String accessMode;

    @JsonProperty("allowedPrincipalIds")
    private List<String> allowedPrincipalIds;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    /**
     * required true
     */
    @JsonProperty("applicationId")
    private String applicationId;

    /**
     * required true
     */
    @JsonProperty("applicationSecret")
    private String applicationSecret;

    /**
     * required true
     */
    @JsonProperty("authEndpoint")
    private String authEndpoint;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * required true
     */
    @JsonProperty("endpoint")
    private String endpoint;

    /**
     * required true
     */
    @JsonProperty("graphEndpoint")
    private String graphEndpoint;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    /**
     * required true
     */
    @JsonProperty("rancherUrl")
    private String rancherUrl;

    @JsonProperty("removed")
    private String removed;

    /**
     * required true
     */
    @JsonProperty("tenantId")
    private String tenantId;

    /**
     * required true
     */
    @JsonProperty("tokenEndpoint")
    private String tokenEndpoint;

    @JsonProperty("type")
    private String type;

    @JsonProperty("uuid")
    private String uuid;
}
