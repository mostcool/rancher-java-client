package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class JobConfig extends AbstractType {

    @JsonProperty("activeDeadlineSeconds")
    private Integer activeDeadlineSeconds;

    @JsonProperty("backoffLimit")
    private Integer backoffLimit;

    @JsonProperty("completions")
    private Integer completions;

    @JsonProperty("manualSelector")
    private Boolean manualSelector;

    @JsonProperty("parallelism")
    private Integer parallelism;
}
