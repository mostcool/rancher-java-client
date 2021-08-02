package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EnvFrom extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("sourceKey")
    private String sourceKey;

    /**
     * required true
     */
    @JsonProperty("sourceName")
    private String sourceName;

    @JsonProperty("targetKey")
    private String targetKey;
}
