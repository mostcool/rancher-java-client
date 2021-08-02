package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class ActiveDirectoryConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("accessMode")
    private String accessMode;

    @JsonProperty("allowedPrincipalIds")
    private List<String> allowedPrincipalIds;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("certificate")
    private String certificate;

    /**
     * required true
     */
    @JsonProperty("connectionTimeout")
    private Integer connectionTimeout;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("defaultLoginDomain")
    private String defaultLoginDomain;

    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * required true
     */
    @JsonProperty("groupDNAttribute")
    private String groupDnattribute;

    /**
     * required true
     */
    @JsonProperty("groupMemberMappingAttribute")
    private String groupMemberMappingAttribute;

    /**
     * required true
     */
    @JsonProperty("groupMemberUserAttribute")
    private String groupMemberUserAttribute;

    /**
     * required true
     */
    @JsonProperty("groupNameAttribute")
    private String groupNameAttribute;

    /**
     * required true
     */
    @JsonProperty("groupObjectClass")
    private String groupObjectClass;

    /**
     * required true
     */
    @JsonProperty("groupSearchAttribute")
    private String groupSearchAttribute;

    @JsonProperty("groupSearchBase")
    private String groupSearchBase;

    @JsonProperty("groupSearchFilter")
    private String groupSearchFilter;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nestedGroupMembershipEnabled")
    private Boolean nestedGroupMembershipEnabled;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("port")
    private Integer port;

    @JsonProperty("removed")
    private String removed;

    /**
     * required true
     */
    @JsonProperty("servers")
    private List<String> servers;

    /**
     * required true
     */
    @JsonProperty("serviceAccountPassword")
    private String serviceAccountPassword;

    /**
     * required true
     */
    @JsonProperty("serviceAccountUsername")
    private String serviceAccountUsername;

    @JsonProperty("tls")
    private Boolean tls;

    @JsonProperty("type")
    private String type;

    @JsonProperty("userDisabledBitMask")
    private Integer userDisabledBitMask;

    /**
     * required true
     */
    @JsonProperty("userEnabledAttribute")
    private String userEnabledAttribute;

    /**
     * required true
     */
    @JsonProperty("userLoginAttribute")
    private String userLoginAttribute;

    /**
     * required true
     */
    @JsonProperty("userNameAttribute")
    private String userNameAttribute;

    /**
     * required true
     */
    @JsonProperty("userObjectClass")
    private String userObjectClass;

    /**
     * required true
     */
    @JsonProperty("userSearchAttribute")
    private String userSearchAttribute;

    /**
     * required true
     */
    @JsonProperty("userSearchBase")
    private String userSearchBase;

    @JsonProperty("userSearchFilter")
    private String userSearchFilter;

    @JsonProperty("uuid")
    private String uuid;
}
