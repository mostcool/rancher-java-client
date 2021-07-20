package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class App extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("answers")
    private Map<String, Object> answers;
    
    @JsonProperty("appRevisionId")
    private String appRevisionId;
    
    @JsonProperty("appliedFiles")
    private Map<String, Object> appliedFiles;
    
    @JsonProperty("conditions")
    private List<AppCondition> conditions;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("externalId")
    private String externalId;
    
    @JsonProperty("files")
    private Map<String, Object> files;
    
    @JsonProperty("helmVersion")
    private String helmVersion;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("lastAppliedTemplate")
    private String lastAppliedTemplate;
    
    @JsonProperty("multiClusterAppId")
    private String multiClusterAppId;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("notes")
    private String notes;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("prune")
    private Boolean prune;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("targetNamespace")
    private String targetNamespace;
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("valuesYaml")
    private String valuesYaml;
    
    @JsonProperty("wait")
    private Boolean wait;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
    }
    
    public String getAppRevisionId() {
        return this.appRevisionId;
    }

    public void setAppRevisionId(String appRevisionId) {
      this.appRevisionId = appRevisionId;
    }
    
    public Map<String, Object> getAppliedFiles() {
        return this.appliedFiles;
    }

    public void setAppliedFiles(Map<String, Object> appliedFiles) {
      this.appliedFiles = appliedFiles;
    }
    
    public List<AppCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<AppCondition> conditions) {
      this.conditions = conditions;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public Map<String, Object> getFiles() {
        return this.files;
    }

    public void setFiles(Map<String, Object> files) {
      this.files = files;
    }
    
    public String getHelmVersion() {
        return this.helmVersion;
    }

    public void setHelmVersion(String helmVersion) {
      this.helmVersion = helmVersion;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastAppliedTemplate() {
        return this.lastAppliedTemplate;
    }

    public void setLastAppliedTemplate(String lastAppliedTemplate) {
      this.lastAppliedTemplate = lastAppliedTemplate;
    }
    
    public String getMultiClusterAppId() {
        return this.multiClusterAppId;
    }

    public void setMultiClusterAppId(String multiClusterAppId) {
      this.multiClusterAppId = multiClusterAppId;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
      this.notes = notes;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public Boolean getPrune() {
        return this.prune;
    }

    public void setPrune(Boolean prune) {
      this.prune = prune;
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
    
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    public void setTargetNamespace(String targetNamespace) {
      this.targetNamespace = targetNamespace;
    }
    
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
      this.timeout = timeout;
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getValuesYaml() {
        return this.valuesYaml;
    }

    public void setValuesYaml(String valuesYaml) {
      this.valuesYaml = valuesYaml;
    }
    
    public Boolean getWait() {
        return this.wait;
    }

    public void setWait(Boolean wait) {
      this.wait = wait;
    }
    
}
