package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EnvFromSource extends AbstractType {

    @JsonProperty("configMapRef")
    private ConfigMapEnvSource configMapRef;

    @JsonProperty("prefix")
    private String prefix;

    @JsonProperty("secretRef")
    private SecretEnvSource secretRef;
}
