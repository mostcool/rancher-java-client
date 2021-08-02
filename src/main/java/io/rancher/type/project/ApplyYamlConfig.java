package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ApplyYamlConfig extends AbstractType {

    @JsonProperty("content")
    private String content;

    @JsonProperty("namespace")
    private String namespace;

    @JsonProperty("path")
    private String path;
}
