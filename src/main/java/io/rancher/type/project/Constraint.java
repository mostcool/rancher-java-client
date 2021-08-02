package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Constraint extends AbstractType {

    @JsonProperty("exclude")
    private List<String> exclude;

    @JsonProperty("include")
    private List<String> include;
}
