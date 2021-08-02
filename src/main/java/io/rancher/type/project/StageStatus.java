package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class StageStatus extends AbstractType {

    @JsonProperty("ended")
    private String ended;

    @JsonProperty("started")
    private String started;

    @JsonProperty("state")
    private String state;

    @JsonProperty("steps")
    private List<StepStatus> steps;
}
