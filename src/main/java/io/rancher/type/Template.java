package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Template extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("catalogId")
    private String catalogId;

    @JsonProperty("categories")
    private List<String> categories;

    @JsonProperty("category")
    private String category;

    @JsonProperty("clusterCatalogId")
    private String clusterCatalogId;

    /**
     * required true
     */
    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("defaultTemplateVersionId")
    private String defaultTemplateVersionId;

    @JsonProperty("defaultVersion")
    private String defaultVersion;

    @JsonProperty("description")
    private String description;

    @JsonProperty("folderName")
    private String folderName;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("iconFilename")
    private String iconFilename;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("maintainer")
    private String maintainer;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("path")
    private String path;

    @JsonProperty("projectCatalogId")
    private String projectCatalogId;

    /**
     * required true
     */
    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("projectURL")
    private String projectUrl;

    @JsonProperty("readme")
    private String readme;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private TemplateStatus status;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("upgradeFrom")
    private String upgradeFrom;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("versionLinks")
    private Map<String, Object> versionLinks;

    @JsonProperty("versions")
    private List<TemplateVersionSpec> versions;
}
