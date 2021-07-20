package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;

public class PodSecurityPolicyTemplate extends AbstractType {
    
    @JsonProperty("allowPrivilegeEscalation")
    private Boolean allowPrivilegeEscalation;
    
    @JsonProperty("allowedCSIDrivers")
    private List<AllowedCSIDriver> allowedCsidrivers;
    
    @JsonProperty("allowedCapabilities")
    private List<String> allowedCapabilities;
    
    @JsonProperty("allowedFlexVolumes")
    private List<AllowedFlexVolume> allowedFlexVolumes;
    
    @JsonProperty("allowedHostPaths")
    private List<AllowedHostPath> allowedHostPaths;
    
    @JsonProperty("allowedProcMountTypes")
    private List<String> allowedProcMountTypes;
    
    @JsonProperty("allowedUnsafeSysctls")
    private List<String> allowedUnsafeSysctls;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("defaultAddCapabilities")
    private List<String> defaultAddCapabilities;
    
    @JsonProperty("defaultAllowPrivilegeEscalation")
    private Boolean defaultAllowPrivilegeEscalation;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("forbiddenSysctls")
    private List<String> forbiddenSysctls;
    
    @JsonProperty("fsGroup")
    private FsGroupStrategyOptions fsGroup;
    
    @JsonProperty("hostIPC")
    private Boolean hostIpc;
    
    @JsonProperty("hostNetwork")
    private Boolean hostNetwork;
    
    @JsonProperty("hostPID")
    private Boolean hostPid;
    
    @JsonProperty("hostPorts")
    private List<HostPortRange> hostPorts;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("privileged")
    private Boolean privileged;
    
    @JsonProperty("readOnlyRootFilesystem")
    private Boolean readOnlyRootFilesystem;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("requiredDropCapabilities")
    private List<String> requiredDropCapabilities;
    
    @JsonProperty("runAsGroup")
    private RunAsGroupStrategyOptions runAsGroup;
    
    @JsonProperty("runAsUser")
    private RunAsUserStrategyOptions runAsUser;
    
    @JsonProperty("runtimeClass")
    private RuntimeClassStrategyOptions runtimeClass;
    
    @JsonProperty("seLinux")
    private SeLinuxStrategyOptions seLinux;
    
    @JsonProperty("supplementalGroups")
    private SupplementalGroupsStrategyOptions supplementalGroups;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("volumes")
    private List<String> volumes;
    
    public Boolean getAllowPrivilegeEscalation() {
        return this.allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
      this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }
    
    public List<AllowedCSIDriver> getAllowedCsidrivers() {
        return this.allowedCsidrivers;
    }

    public void setAllowedCsidrivers(List<AllowedCSIDriver> allowedCsidrivers) {
      this.allowedCsidrivers = allowedCsidrivers;
    }
    
    public List<String> getAllowedCapabilities() {
        return this.allowedCapabilities;
    }

    public void setAllowedCapabilities(List<String> allowedCapabilities) {
      this.allowedCapabilities = allowedCapabilities;
    }
    
    public List<AllowedFlexVolume> getAllowedFlexVolumes() {
        return this.allowedFlexVolumes;
    }

    public void setAllowedFlexVolumes(List<AllowedFlexVolume> allowedFlexVolumes) {
      this.allowedFlexVolumes = allowedFlexVolumes;
    }
    
    public List<AllowedHostPath> getAllowedHostPaths() {
        return this.allowedHostPaths;
    }

    public void setAllowedHostPaths(List<AllowedHostPath> allowedHostPaths) {
      this.allowedHostPaths = allowedHostPaths;
    }
    
    public List<String> getAllowedProcMountTypes() {
        return this.allowedProcMountTypes;
    }

    public void setAllowedProcMountTypes(List<String> allowedProcMountTypes) {
      this.allowedProcMountTypes = allowedProcMountTypes;
    }
    
    public List<String> getAllowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls;
    }

    public void setAllowedUnsafeSysctls(List<String> allowedUnsafeSysctls) {
      this.allowedUnsafeSysctls = allowedUnsafeSysctls;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
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
    
    public List<String> getDefaultAddCapabilities() {
        return this.defaultAddCapabilities;
    }

    public void setDefaultAddCapabilities(List<String> defaultAddCapabilities) {
      this.defaultAddCapabilities = defaultAddCapabilities;
    }
    
    public Boolean getDefaultAllowPrivilegeEscalation() {
        return this.defaultAllowPrivilegeEscalation;
    }

    public void setDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
      this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public List<String> getForbiddenSysctls() {
        return this.forbiddenSysctls;
    }

    public void setForbiddenSysctls(List<String> forbiddenSysctls) {
      this.forbiddenSysctls = forbiddenSysctls;
    }
    
    public FsGroupStrategyOptions getFsGroup() {
        return this.fsGroup;
    }

    public void setFsGroup(FsGroupStrategyOptions fsGroup) {
      this.fsGroup = fsGroup;
    }
    
    public Boolean getHostIpc() {
        return this.hostIpc;
    }

    public void setHostIpc(Boolean hostIpc) {
      this.hostIpc = hostIpc;
    }
    
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
      this.hostNetwork = hostNetwork;
    }
    
    public Boolean getHostPid() {
        return this.hostPid;
    }

    public void setHostPid(Boolean hostPid) {
      this.hostPid = hostPid;
    }
    
    public List<HostPortRange> getHostPorts() {
        return this.hostPorts;
    }

    public void setHostPorts(List<HostPortRange> hostPorts) {
      this.hostPorts = hostPorts;
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
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public Boolean getReadOnlyRootFilesystem() {
        return this.readOnlyRootFilesystem;
    }

    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
      this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<String> getRequiredDropCapabilities() {
        return this.requiredDropCapabilities;
    }

    public void setRequiredDropCapabilities(List<String> requiredDropCapabilities) {
      this.requiredDropCapabilities = requiredDropCapabilities;
    }
    
    public RunAsGroupStrategyOptions getRunAsGroup() {
        return this.runAsGroup;
    }

    public void setRunAsGroup(RunAsGroupStrategyOptions runAsGroup) {
      this.runAsGroup = runAsGroup;
    }
    
    public RunAsUserStrategyOptions getRunAsUser() {
        return this.runAsUser;
    }

    public void setRunAsUser(RunAsUserStrategyOptions runAsUser) {
      this.runAsUser = runAsUser;
    }
    
    public RuntimeClassStrategyOptions getRuntimeClass() {
        return this.runtimeClass;
    }

    public void setRuntimeClass(RuntimeClassStrategyOptions runtimeClass) {
      this.runtimeClass = runtimeClass;
    }
    
    public SeLinuxStrategyOptions getSeLinux() {
        return this.seLinux;
    }

    public void setSeLinux(SeLinuxStrategyOptions seLinux) {
      this.seLinux = seLinux;
    }
    
    public SupplementalGroupsStrategyOptions getSupplementalGroups() {
        return this.supplementalGroups;
    }

    public void setSupplementalGroups(SupplementalGroupsStrategyOptions supplementalGroups) {
      this.supplementalGroups = supplementalGroups;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public List<String> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(List<String> volumes) {
      this.volumes = volumes;
    }
    
}
