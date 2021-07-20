package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Container extends AbstractType {
    
    @JsonProperty("allowPrivilegeEscalation")
    private Boolean allowPrivilegeEscalation;
    
    @JsonProperty("capAdd")
    private List<String> capAdd;
    
    @JsonProperty("capDrop")
    private List<String> capDrop;
    
    @JsonProperty("command")
    private List<String> command;
    
    @JsonProperty("entrypoint")
    private List<String> entrypoint;
    
    @JsonProperty("environment")
    private Map<String, Object> environment;
    
    @JsonProperty("environmentFrom")
    private List<EnvironmentFrom> environmentFrom;
    
    @JsonProperty("exitCode")
    private Integer exitCode;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("imagePullPolicy")
    private String imagePullPolicy;
    
    @JsonProperty("initContainer")
    private Boolean initContainer;
    
    @JsonProperty("livenessProbe")
    private Probe livenessProbe;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ports")
    private List<ContainerPort> ports;
    
    @JsonProperty("postStart")
    private Handler postStart;
    
    @JsonProperty("preStop")
    private Handler preStop;
    
    @JsonProperty("privileged")
    private Boolean privileged;
    
    @JsonProperty("procMount")
    private String procMount;
    
    @JsonProperty("readOnly")
    private Boolean readOnly;
    
    @JsonProperty("readinessProbe")
    private Probe readinessProbe;
    
    @JsonProperty("resources")
    private ResourceRequirements resources;
    
    @JsonProperty("restartCount")
    private Integer restartCount;
    
    @JsonProperty("runAsGroup")
    private Integer runAsGroup;
    
    @JsonProperty("runAsNonRoot")
    private Boolean runAsNonRoot;
    
    @JsonProperty("startupProbe")
    private Probe startupProbe;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("stdin")
    private Boolean stdin;
    
    @JsonProperty("stdinOnce")
    private Boolean stdinOnce;
    
    @JsonProperty("terminationMessagePath")
    private String terminationMessagePath;
    
    @JsonProperty("terminationMessagePolicy")
    private String terminationMessagePolicy;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("tty")
    private Boolean tty;
    
    @JsonProperty("uid")
    private Integer uid;
    
    @JsonProperty("volumeDevices")
    private List<VolumeDevice> volumeDevices;
    
    @JsonProperty("volumeMounts")
    private List<VolumeMount> volumeMounts;
    
    @JsonProperty("windowsOptions")
    private WindowsSecurityContextOptions windowsOptions;
    
    @JsonProperty("workingDir")
    private String workingDir;
    
    public Boolean getAllowPrivilegeEscalation() {
        return this.allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
      this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }
    
    public List<String> getCapAdd() {
        return this.capAdd;
    }

    public void setCapAdd(List<String> capAdd) {
      this.capAdd = capAdd;
    }
    
    public List<String> getCapDrop() {
        return this.capDrop;
    }

    public void setCapDrop(List<String> capDrop) {
      this.capDrop = capDrop;
    }
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public List<String> getEntrypoint() {
        return this.entrypoint;
    }

    public void setEntrypoint(List<String> entrypoint) {
      this.entrypoint = entrypoint;
    }
    
    public Map<String, Object> getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Map<String, Object> environment) {
      this.environment = environment;
    }
    
    public List<EnvironmentFrom> getEnvironmentFrom() {
        return this.environmentFrom;
    }

    public void setEnvironmentFrom(List<EnvironmentFrom> environmentFrom) {
      this.environmentFrom = environmentFrom;
    }
    
    public Integer getExitCode() {
        return this.exitCode;
    }

    public void setExitCode(Integer exitCode) {
      this.exitCode = exitCode;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getImagePullPolicy() {
        return this.imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
      this.imagePullPolicy = imagePullPolicy;
    }
    
    public Boolean getInitContainer() {
        return this.initContainer;
    }

    public void setInitContainer(Boolean initContainer) {
      this.initContainer = initContainer;
    }
    
    public Probe getLivenessProbe() {
        return this.livenessProbe;
    }

    public void setLivenessProbe(Probe livenessProbe) {
      this.livenessProbe = livenessProbe;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<ContainerPort> getPorts() {
        return this.ports;
    }

    public void setPorts(List<ContainerPort> ports) {
      this.ports = ports;
    }
    
    public Handler getPostStart() {
        return this.postStart;
    }

    public void setPostStart(Handler postStart) {
      this.postStart = postStart;
    }
    
    public Handler getPreStop() {
        return this.preStop;
    }

    public void setPreStop(Handler preStop) {
      this.preStop = preStop;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public String getProcMount() {
        return this.procMount;
    }

    public void setProcMount(String procMount) {
      this.procMount = procMount;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public Probe getReadinessProbe() {
        return this.readinessProbe;
    }

    public void setReadinessProbe(Probe readinessProbe) {
      this.readinessProbe = readinessProbe;
    }
    
    public ResourceRequirements getResources() {
        return this.resources;
    }

    public void setResources(ResourceRequirements resources) {
      this.resources = resources;
    }
    
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public void setRestartCount(Integer restartCount) {
      this.restartCount = restartCount;
    }
    
    public Integer getRunAsGroup() {
        return this.runAsGroup;
    }

    public void setRunAsGroup(Integer runAsGroup) {
      this.runAsGroup = runAsGroup;
    }
    
    public Boolean getRunAsNonRoot() {
        return this.runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
      this.runAsNonRoot = runAsNonRoot;
    }
    
    public Probe getStartupProbe() {
        return this.startupProbe;
    }

    public void setStartupProbe(Probe startupProbe) {
      this.startupProbe = startupProbe;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public Boolean getStdin() {
        return this.stdin;
    }

    public void setStdin(Boolean stdin) {
      this.stdin = stdin;
    }
    
    public Boolean getStdinOnce() {
        return this.stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
      this.stdinOnce = stdinOnce;
    }
    
    public String getTerminationMessagePath() {
        return this.terminationMessagePath;
    }

    public void setTerminationMessagePath(String terminationMessagePath) {
      this.terminationMessagePath = terminationMessagePath;
    }
    
    public String getTerminationMessagePolicy() {
        return this.terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
      this.terminationMessagePolicy = terminationMessagePolicy;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Boolean getTty() {
        return this.tty;
    }

    public void setTty(Boolean tty) {
      this.tty = tty;
    }
    
    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
      this.uid = uid;
    }
    
    public List<VolumeDevice> getVolumeDevices() {
        return this.volumeDevices;
    }

    public void setVolumeDevices(List<VolumeDevice> volumeDevices) {
      this.volumeDevices = volumeDevices;
    }
    
    public List<VolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
      this.volumeMounts = volumeMounts;
    }
    
    public WindowsSecurityContextOptions getWindowsOptions() {
        return this.windowsOptions;
    }

    public void setWindowsOptions(WindowsSecurityContextOptions windowsOptions) {
      this.windowsOptions = windowsOptions;
    }
    
    public String getWorkingDir() {
        return this.workingDir;
    }

    public void setWorkingDir(String workingDir) {
      this.workingDir = workingDir;
    }
    
}
