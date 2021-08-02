package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class KeyToPath extends AbstractType {

    @JsonProperty("key")
    private String key;

    @JsonProperty("mode")
    private Integer mode;

    @JsonProperty("path")
    private String path;
}
