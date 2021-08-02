package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class LdapFields extends AbstractType {

    @JsonProperty("certificate")
    private String certificate;

    /**
     * required true
     */
    @JsonProperty("connectionTimeout")
    private Integer connectionTimeout;

    @JsonProperty("groupDNAttribute")
    private String groupDnattribute;

    /**
     * required true
     */
    @JsonProperty("groupMemberMappingAttribute")
    private String groupMemberMappingAttribute;

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

    @JsonProperty("nestedGroupMembershipEnabled")
    private Boolean nestedGroupMembershipEnabled;

    /**
     * required true
     */
    @JsonProperty("port")
    private Integer port;

    /**
     * required true
     */
    @JsonProperty("servers")
    private List<String> servers;

    /**
     * required true
     */
    @JsonProperty("serviceAccountDistinguishedName")
    private String serviceAccountDistinguishedName;

    /**
     * required true
     */
    @JsonProperty("serviceAccountPassword")
    private String serviceAccountPassword;

    /**
     * required true
     */
    @JsonProperty("tls")
    private Boolean tls;

    @JsonProperty("userDisabledBitMask")
    private Integer userDisabledBitMask;

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
    @JsonProperty("userMemberAttribute")
    private String userMemberAttribute;

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
}
