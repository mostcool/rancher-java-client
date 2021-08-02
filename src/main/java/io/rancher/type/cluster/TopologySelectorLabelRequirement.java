package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TopologySelectorLabelRequirement extends AbstractType {

    @JsonProperty("key")
    private String key;

    @JsonProperty("values")
    private List<String> values;
}
