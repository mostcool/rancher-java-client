package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.List;

public class CloudCredential extends AbstractType {
    
    @JsonProperty("amazonec2credentialConfig")
    private Amazonec2credentialconfig amazonec2credentialConfig;
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("azurecredentialConfig")
    private Azurecredentialconfig azurecredentialConfig;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("digitaloceancredentialConfig")
    private Digitaloceancredentialconfig digitaloceancredentialConfig;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("linodecredentialConfig")
    private Linodecredentialconfig linodecredentialConfig;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("vmwarevspherecredentialConfig")
    private Vmwarevspherecredentialconfig vmwarevspherecredentialConfig;
    
    public Amazonec2credentialconfig getAmazonec2credentialConfig() {
        return this.amazonec2credentialConfig;
    }

    public void setAmazonec2credentialConfig(Amazonec2credentialconfig amazonec2credentialConfig) {
      this.amazonec2credentialConfig = amazonec2credentialConfig;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Azurecredentialconfig getAzurecredentialConfig() {
        return this.azurecredentialConfig;
    }

    public void setAzurecredentialConfig(Azurecredentialconfig azurecredentialConfig) {
      this.azurecredentialConfig = azurecredentialConfig;
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
    
    public Digitaloceancredentialconfig getDigitaloceancredentialConfig() {
        return this.digitaloceancredentialConfig;
    }

    public void setDigitaloceancredentialConfig(Digitaloceancredentialconfig digitaloceancredentialConfig) {
      this.digitaloceancredentialConfig = digitaloceancredentialConfig;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Linodecredentialconfig getLinodecredentialConfig() {
        return this.linodecredentialConfig;
    }

    public void setLinodecredentialConfig(Linodecredentialconfig linodecredentialConfig) {
      this.linodecredentialConfig = linodecredentialConfig;
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
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Vmwarevspherecredentialconfig getVmwarevspherecredentialConfig() {
        return this.vmwarevspherecredentialConfig;
    }

    public void setVmwarevspherecredentialConfig(Vmwarevspherecredentialconfig vmwarevspherecredentialConfig) {
      this.vmwarevspherecredentialConfig = vmwarevspherecredentialConfig;
    }
    
}
