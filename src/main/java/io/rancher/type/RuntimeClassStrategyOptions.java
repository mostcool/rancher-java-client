package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RuntimeClassStrategyOptions extends AbstractType {

    @JsonProperty("allowedRuntimeClassNames")
    private List<String> allowedRuntimeClassNames;

    @JsonProperty("defaultRuntimeClassName")
    private String defaultRuntimeClassName;
}
