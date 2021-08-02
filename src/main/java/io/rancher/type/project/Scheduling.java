package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Scheduling extends AbstractType {

    @JsonProperty("node")
    private NodeScheduling node;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("priorityClassName")
    private String priorityClassName;

    @JsonProperty("scheduler")
    private String scheduler;

    @JsonProperty("tolerate")
    private List<Toleration> tolerate;
}
