package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PipelineConfig extends AbstractType {

    @JsonProperty("branch")
    private Constraint branch;

    @JsonProperty("notification")
    private PipelineNotification notification;

    @JsonProperty("stages")
    private List<Stage> stages;

    @JsonProperty("timeout")
    private Integer timeout;
}
