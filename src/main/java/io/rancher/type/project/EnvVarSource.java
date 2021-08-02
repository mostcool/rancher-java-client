package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EnvVarSource extends AbstractType {

    @JsonProperty("configMapKeyRef")
    private ConfigMapKeySelector configMapKeyRef;

    @JsonProperty("fieldRef")
    private ObjectFieldSelector fieldRef;

    @JsonProperty("resourceFieldRef")
    private ResourceFieldSelector resourceFieldRef;

    @JsonProperty("secretKeyRef")
    private SecretKeySelector secretKeyRef;
}
