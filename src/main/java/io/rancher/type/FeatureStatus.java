package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FeatureStatus extends AbstractType {

    @JsonProperty("default")
    private Boolean defaultFlag;

    @JsonProperty("description")
    private String description;

    @JsonProperty("dynamic")
    private Boolean dynamic;
}
