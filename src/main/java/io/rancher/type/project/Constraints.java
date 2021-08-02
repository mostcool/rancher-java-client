package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Constraints extends AbstractType {

    @JsonProperty("branch")
    private Constraint branch;

    @JsonProperty("event")
    private Constraint event;
}
