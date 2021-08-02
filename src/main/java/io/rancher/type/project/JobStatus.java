package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class JobStatus extends AbstractType {

    @JsonProperty("active")
    private Integer active;

    @JsonProperty("completionTime")
    private String completionTime;

    @JsonProperty("conditions")
    private List<JobCondition> conditions;

    @JsonProperty("failed")
    private Integer failed;

    @JsonProperty("startTime")
    private String startTime;

    @JsonProperty("succeeded")
    private Integer succeeded;
}
