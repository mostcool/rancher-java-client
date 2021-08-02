package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StepStatus extends AbstractType {

    @JsonProperty("ended")
    private String ended;

    @JsonProperty("started")
    private String started;

    @JsonProperty("state")
    private String state;
}
