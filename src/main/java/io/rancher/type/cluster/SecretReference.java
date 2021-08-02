package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SecretReference extends AbstractType {

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespace")
    private String namespace;
}
