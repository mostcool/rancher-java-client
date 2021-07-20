package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class EnvVarSource extends AbstractType {
    
    @JsonProperty("configMapKeyRef")
    private ConfigMapKeySelector configMapKeyRef;
    
    @JsonProperty("fieldRef")
    private ObjectFieldSelector fieldRef;
    
    @JsonProperty("resourceFieldRef")
    private ResourceFieldSelector resourceFieldRef;
    
    @JsonProperty("secretKeyRef")
    private SecretKeySelector secretKeyRef;
    
    public ConfigMapKeySelector getConfigMapKeyRef() {
        return this.configMapKeyRef;
    }

    public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
      this.configMapKeyRef = configMapKeyRef;
    }
    
    public ObjectFieldSelector getFieldRef() {
        return this.fieldRef;
    }

    public void setFieldRef(ObjectFieldSelector fieldRef) {
      this.fieldRef = fieldRef;
    }
    
    public ResourceFieldSelector getResourceFieldRef() {
        return this.resourceFieldRef;
    }

    public void setResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
      this.resourceFieldRef = resourceFieldRef;
    }
    
    public SecretKeySelector getSecretKeyRef() {
        return this.secretKeyRef;
    }

    public void setSecretKeyRef(SecretKeySelector secretKeyRef) {
      this.secretKeyRef = secretKeyRef;
    }
    
}
