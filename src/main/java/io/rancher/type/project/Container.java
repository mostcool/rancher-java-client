package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
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
}
