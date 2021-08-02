package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class TemplateVersionSpec extends AbstractType {

    @JsonProperty("appReadme")
    private String appReadme;

    @JsonProperty("digest")
    private String digest;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("files")
    private Map<String, Object> files;

    @JsonProperty("kubeVersion")
    private String kubeVersion;

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

    @JsonProperty("requiredNamespace")
    private String requiredNamespace;

    @JsonProperty("upgradeVersionLinks")
    private Map<String, Object> upgradeVersionLinks;

    @JsonProperty("version")
    private String version;

    @JsonProperty("versionDir")
    private String versionDir;

    @JsonProperty("versionName")
    private String versionName;

    @JsonProperty("versionUrls")
    private List<String> versionUrls;
}
