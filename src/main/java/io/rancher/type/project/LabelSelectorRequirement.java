package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class LabelSelectorRequirement extends AbstractType {

    @JsonProperty("key")
    private String key;

    @JsonProperty("operator")
    private String operator;

    @JsonProperty("values")
    private List<String> values;
}
