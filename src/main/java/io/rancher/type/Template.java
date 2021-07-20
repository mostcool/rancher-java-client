package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

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
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCatalogId() {
        return this.catalogId;
    }

    public void setCatalogId(String catalogId) {
      this.catalogId = catalogId;
    }
    
    public List<String> getCategories() {
        return this.categories;
    }

    public void setCategories(List<String> categories) {
      this.categories = categories;
    }
    
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
      this.category = category;
    }
    
    public String getClusterCatalogId() {
        return this.clusterCatalogId;
    }

    public void setClusterCatalogId(String clusterCatalogId) {
      this.clusterCatalogId = clusterCatalogId;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
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
    
    public String getDefaultTemplateVersionId() {
        return this.defaultTemplateVersionId;
    }

    public void setDefaultTemplateVersionId(String defaultTemplateVersionId) {
      this.defaultTemplateVersionId = defaultTemplateVersionId;
    }
    
    public String getDefaultVersion() {
        return this.defaultVersion;
    }

    public void setDefaultVersion(String defaultVersion) {
      this.defaultVersion = defaultVersion;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getFolderName() {
        return this.folderName;
    }

    public void setFolderName(String folderName) {
      this.folderName = folderName;
    }
    
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
      this.icon = icon;
    }
    
    public String getIconFilename() {
        return this.iconFilename;
    }

    public void setIconFilename(String iconFilename) {
      this.iconFilename = iconFilename;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getMaintainer() {
        return this.maintainer;
    }

    public void setMaintainer(String maintainer) {
      this.maintainer = maintainer;
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
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public String getProjectCatalogId() {
        return this.projectCatalogId;
    }

    public void setProjectCatalogId(String projectCatalogId) {
      this.projectCatalogId = projectCatalogId;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getProjectUrl() {
        return this.projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
      this.projectUrl = projectUrl;
    }
    
    public String getReadme() {
        return this.readme;
    }

    public void setReadme(String readme) {
      this.readme = readme;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public TemplateStatus getStatus() {
        return this.status;
    }

    public void setStatus(TemplateStatus status) {
      this.status = status;
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
    
    public String getUpgradeFrom() {
        return this.upgradeFrom;
    }

    public void setUpgradeFrom(String upgradeFrom) {
      this.upgradeFrom = upgradeFrom;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Map<String, Object> getVersionLinks() {
        return this.versionLinks;
    }

    public void setVersionLinks(Map<String, Object> versionLinks) {
      this.versionLinks = versionLinks;
    }
    
    public List<TemplateVersionSpec> getVersions() {
        return this.versions;
    }

    public void setVersions(List<TemplateVersionSpec> versions) {
      this.versions = versions;
    }
    
}
