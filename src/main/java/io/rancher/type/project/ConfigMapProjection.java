package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ConfigMapProjection extends AbstractType {

    @JsonProperty("items")
    private List<KeyToPath> items;

    @JsonProperty("name")
    private String name;

    @JsonProperty("optional")
    private Boolean optional;
}
