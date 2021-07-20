package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

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
    
    public Boolean getNestedGroupMembershipEnabled() {
        return this.nestedGroupMembershipEnabled;
    }

    public void setNestedGroupMembershipEnabled(Boolean nestedGroupMembershipEnabled) {
      this.nestedGroupMembershipEnabled = nestedGroupMembershipEnabled;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
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
    
}
