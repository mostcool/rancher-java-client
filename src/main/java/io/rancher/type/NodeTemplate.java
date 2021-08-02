package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class NodeTemplate extends AbstractType {

    @JsonProperty("amazonec2Config")
    private Amazonec2config amazonec2config;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("authCertificateAuthority")
    private String authCertificateAuthority;

    @JsonProperty("authKey")
    private String authKey;

    @JsonProperty("azureConfig")
    private Azureconfig azureConfig;

    @JsonProperty("cloudCredentialId")
    private String cloudCredentialId;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("digitaloceanConfig")
    private Digitaloceanconfig digitaloceanConfig;

    @JsonProperty("dockerVersion")
    private String dockerVersion;

    @JsonProperty("driver")
    private String driver;

    @JsonProperty("engineEnv")
    private Map<String, Object> engineEnv;

    @JsonProperty("engineInsecureRegistry")
    private List<String> engineInsecureRegistry;

    @JsonProperty("engineInstallURL")
    private String engineInstallUrl;

    @JsonProperty("engineLabel")
    private Map<String, Object> engineLabel;

    @JsonProperty("engineOpt")
    private Map<String, Object> engineOpt;

    @JsonProperty("engineRegistryMirror")
    private List<String> engineRegistryMirror;

    @JsonProperty("engineStorageDriver")
    private String engineStorageDriver;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("linodeConfig")
    private Linodeconfig linodeConfig;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nodeTaints")
    private List<Taint> nodeTaints;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private NodeTemplateStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("useInternalIpAddress")
    private Boolean useInternalIpAddress;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vmwarevsphereConfig")
    private Vmwarevsphereconfig vmwarevsphereConfig;
}
