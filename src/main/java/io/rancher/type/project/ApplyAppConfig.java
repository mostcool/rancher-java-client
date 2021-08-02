package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class ApplyAppConfig extends AbstractType {

    @JsonProperty("answers")
    private Map<String, Object> answers;

    @JsonProperty("catalogTemplate")
    private String catalogTemplate;

    @JsonProperty("name")
    private String name;

    @JsonProperty("targetNamespace")
    private String targetNamespace;

    @JsonProperty("version")
    private String version;
}
