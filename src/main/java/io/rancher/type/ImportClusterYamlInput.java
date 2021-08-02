package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ImportClusterYamlInput extends AbstractType {

    @JsonProperty("defaultNamespace")
    private String defaultNamespace;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("yaml")
    private String yaml;
}
