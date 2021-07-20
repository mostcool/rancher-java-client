package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

public class FreeIpaConfig extends AbstractType {
    
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
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
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
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    /**
     * required true
     */
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
    
    @JsonProperty("type")
    private String type;
    
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
    
    @JsonProperty("uuid")
    private String uuid;
    
    public String getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(String accessMode) {
      this.accessMode = accessMode;
    }
    
    public List<String> getAllowedPrincipalIds() {
        return this.allowedPrincipalIds;
    }

    public void setAllowedPrincipalIds(List<String> allowedPrincipalIds) {
      this.allowedPrincipalIds = allowedPrincipalIds;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
      this.connectionTimeout = connectionTimeout;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getGroupDnattribute() {
        return this.groupDnattribute;
    }

    public void setGroupDnattribute(String groupDnattribute) {
      this.groupDnattribute = groupDnattribute;
    }
    
    public String getGroupMemberMappingAttribute() {
        return this.groupMemberMappingAttribute;
    }

    public void setGroupMemberMappingAttribute(String groupMemberMappingAttribute) {
      this.groupMemberMappingAttribute = groupMemberMappingAttribute;
    }
    
    public String getGroupMemberUserAttribute() {
        return this.groupMemberUserAttribute;
    }

    public void setGroupMemberUserAttribute(String groupMemberUserAttribute) {
      this.groupMemberUserAttribute = groupMemberUserAttribute;
    }
    
    public String getGroupNameAttribute() {
        return this.groupNameAttribute;
    }

    public void setGroupNameAttribute(String groupNameAttribute) {
      this.groupNameAttribute = groupNameAttribute;
    }
    
    public String getGroupObjectClass() {
        return this.groupObjectClass;
    }

    public void setGroupObjectClass(String groupObjectClass) {
      this.groupObjectClass = groupObjectClass;
    }
    
    public String getGroupSearchAttribute() {
        return this.groupSearchAttribute;
    }

    public void setGroupSearchAttribute(String groupSearchAttribute) {
      this.groupSearchAttribute = groupSearchAttribute;
    }
    
    public String getGroupSearchBase() {
        return this.groupSearchBase;
    }

    public void setGroupSearchBase(String groupSearchBase) {
      this.groupSearchBase = groupSearchBase;
    }
    
    public String getGroupSearchFilter() {
        return this.groupSearchFilter;
    }

    public void setGroupSearchFilter(String groupSearchFilter) {
      this.groupSearchFilter = groupSearchFilter;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<String> getServers() {
        return this.servers;
    }

    public void setServers(List<String> servers) {
      this.servers = servers;
    }
    
    public String getServiceAccountDistinguishedName() {
        return this.serviceAccountDistinguishedName;
    }

    public void setServiceAccountDistinguishedName(String serviceAccountDistinguishedName) {
      this.serviceAccountDistinguishedName = serviceAccountDistinguishedName;
    }
    
    public String getServiceAccountPassword() {
        return this.serviceAccountPassword;
    }

    public void setServiceAccountPassword(String serviceAccountPassword) {
      this.serviceAccountPassword = serviceAccountPassword;
    }
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public Integer getUserDisabledBitMask() {
        return this.userDisabledBitMask;
    }

    public void setUserDisabledBitMask(Integer userDisabledBitMask) {
      this.userDisabledBitMask = userDisabledBitMask;
    }
    
    public String getUserEnabledAttribute() {
        return this.userEnabledAttribute;
    }

    public void setUserEnabledAttribute(String userEnabledAttribute) {
      this.userEnabledAttribute = userEnabledAttribute;
    }
    
    public String getUserLoginAttribute() {
        return this.userLoginAttribute;
    }

    public void setUserLoginAttribute(String userLoginAttribute) {
      this.userLoginAttribute = userLoginAttribute;
    }
    
    public String getUserMemberAttribute() {
        return this.userMemberAttribute;
    }

    public void setUserMemberAttribute(String userMemberAttribute) {
      this.userMemberAttribute = userMemberAttribute;
    }
    
    public String getUserNameAttribute() {
        return this.userNameAttribute;
    }

    public void setUserNameAttribute(String userNameAttribute) {
      this.userNameAttribute = userNameAttribute;
    }
    
    public String getUserObjectClass() {
        return this.userObjectClass;
    }

    public void setUserObjectClass(String userObjectClass) {
      this.userObjectClass = userObjectClass;
    }
    
    public String getUserSearchAttribute() {
        return this.userSearchAttribute;
    }

    public void setUserSearchAttribute(String userSearchAttribute) {
      this.userSearchAttribute = userSearchAttribute;
    }
    
    public String getUserSearchBase() {
        return this.userSearchBase;
    }

    public void setUserSearchBase(String userSearchBase) {
      this.userSearchBase = userSearchBase;
    }
    
    public String getUserSearchFilter() {
        return this.userSearchFilter;
    }

    public void setUserSearchFilter(String userSearchFilter) {
      this.userSearchFilter = userSearchFilter;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
