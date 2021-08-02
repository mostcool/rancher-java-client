package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class TemplateVersion extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("appReadme")
    private String appReadme;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("digest")
    private String digest;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("files")
    private Map<String, Object> files;

    @JsonProperty("kubeVersion")
    private String kubeVersion;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("questions")
    private List<Question> questions;

    @JsonProperty("rancherMaxVersion")
    private String rancherMaxVersion;

    @JsonProperty("rancherMinVersion")
    private String rancherMinVersion;

    @JsonProperty("rancherVersion")
    private String rancherVersion;

    @JsonProperty("readme")
    private String readme;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("requiredNamespace")
    private String requiredNamespace;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private TemplateVersionStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("upgradeVersionLinks")
    private Map<String, Object> upgradeVersionLinks;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("version")
    private String version;

    @JsonProperty("versionDir")
    private String versionDir;

    @JsonProperty("versionName")
    private String versionName;

    @JsonProperty("versionUrls")
    private List<String> versionUrls;
}
