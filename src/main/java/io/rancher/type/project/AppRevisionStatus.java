package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class AppRevisionStatus extends AbstractType {

    @JsonProperty("answers")
    private Map<String, Object> answers;

    @JsonProperty("digest")
    private String digest;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("files")
    private Map<String, Object> files;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("valuesYaml")
    private String valuesYaml;
}
