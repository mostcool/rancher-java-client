package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class SecretsEncryptionConfig extends AbstractType {

    @JsonProperty("customConfig")
    private Map<String, Object> customConfig;

    @JsonProperty("enabled")
    private Boolean enabled;
}
