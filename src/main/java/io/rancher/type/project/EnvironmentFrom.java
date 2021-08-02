package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EnvironmentFrom extends AbstractType {

    @JsonProperty("optional")
    private Boolean optional;

    @JsonProperty("prefix")
    private String prefix;

    @JsonProperty("source")
    private String source;

    @JsonProperty("sourceKey")
    private String sourceKey;

    @JsonProperty("sourceName")
    private String sourceName;

    @JsonProperty("targetKey")
    private String targetKey;
}
