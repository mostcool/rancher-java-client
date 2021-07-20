package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;

public class EphemeralContainer extends AbstractType {
    
    @JsonProperty("args")
    private List<String> args;
    
    @JsonProperty("command")
    private List<String> command;
    
    @JsonProperty("env")
    private List<EnvVar> env;
    
    @JsonProperty("envFrom")
    private List<EnvFromSource> envFrom;
    
    @JsonProperty("image")
    private String image;
    
    @JsonProperty("imagePullPolicy")
    private String imagePullPolicy;
    
    @JsonProperty("lifecycle")
    private Lifecycle lifecycle;
    
    @JsonProperty("livenessProbe")
    private Probe livenessProbe;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ports")
    private List<ContainerPort> ports;
    
    @JsonProperty("readinessProbe")
    private Probe readinessProbe;
    
    @JsonProperty("resources")
    private ResourceRequirements resources;
    
    @JsonProperty("securityContext")
    private SecurityContext securityContext;
    
    @JsonProperty("startupProbe")
    private Probe startupProbe;
    
    @JsonProperty("stdin")
    private Boolean stdin;
    
    @JsonProperty("stdinOnce")
    private Boolean stdinOnce;
    
    @JsonProperty("targetContainerName")
    private String targetContainerName;
    
    @JsonProperty("terminationMessagePath")
    private String terminationMessagePath;
    
    @JsonProperty("terminationMessagePolicy")
    private String terminationMessagePolicy;
    
    @JsonProperty("tty")
    private Boolean tty;
    
    @JsonProperty("volumeDevices")
    private List<VolumeDevice> volumeDevices;
    
    @JsonProperty("volumeMounts")
    private List<VolumeMount> volumeMounts;
    
    @JsonProperty("workingDir")
    private String workingDir;
    
    public List<String> getArgs() {
        return this.args;
    }

    public void setArgs(List<String> args) {
      this.args = args;
    }
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public List<EnvVar> getEnv() {
        return this.env;
    }

    public void setEnv(List<EnvVar> env) {
      this.env = env;
    }
    
    public List<EnvFromSource> getEnvFrom() {
        return this.envFrom;
    }

    public void setEnvFrom(List<EnvFromSource> envFrom) {
      this.envFrom = envFrom;
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
    
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public void setLifecycle(Lifecycle lifecycle) {
      this.lifecycle = lifecycle;
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
    
    public SecurityContext getSecurityContext() {
        return this.securityContext;
    }

    public void setSecurityContext(SecurityContext securityContext) {
      this.securityContext = securityContext;
    }
    
    public Probe getStartupProbe() {
        return this.startupProbe;
    }

    public void setStartupProbe(Probe startupProbe) {
      this.startupProbe = startupProbe;
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
    
    public String getTargetContainerName() {
        return this.targetContainerName;
    }

    public void setTargetContainerName(String targetContainerName) {
      this.targetContainerName = targetContainerName;
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
    
    public Boolean getTty() {
        return this.tty;
    }

    public void setTty(Boolean tty) {
      this.tty = tty;
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
    
    public String getWorkingDir() {
        return this.workingDir;
    }

    public void setWorkingDir(String workingDir) {
      this.workingDir = workingDir;
    }
    
}
