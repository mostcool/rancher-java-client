package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
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
}
