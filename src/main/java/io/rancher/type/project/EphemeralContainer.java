package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
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
}
