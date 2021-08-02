package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class PingConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("accessMode")
    private String accessMode;

    @JsonProperty("allowedPrincipalIds")
    private List<String> allowedPrincipalIds;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    /**
     * required true
     */
    @JsonProperty("displayNameField")
    private String displayNameField;

    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * required true
     */
    @JsonProperty("groupsField")
    private String groupsField;

    /**
     * required true
     */
    @JsonProperty("idpMetadataContent")
    private String idpMetadataContent;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    /**
     * required true
     */
    @JsonProperty("rancherApiHost")
    private String rancherApiHost;

    @JsonProperty("removed")
    private String removed;

    /**
     * required true
     */
    @JsonProperty("spCert")
    private String spCert;

    /**
     * required true
     */
    @JsonProperty("spKey")
    private String spKey;

    @JsonProperty("type")
    private String type;

    /**
     * required true
     */
    @JsonProperty("uidField")
    private String uidField;

    /**
     * required true
     */
    @JsonProperty("userNameField")
    private String userNameField;

    @JsonProperty("uuid")
    private String uuid;
}
