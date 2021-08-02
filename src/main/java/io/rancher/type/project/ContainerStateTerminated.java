package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ContainerStateTerminated extends AbstractType {

    @JsonProperty("containerID")
    private String containerId;

    @JsonProperty("exitCode")
    private Integer exitCode;

    @JsonProperty("finishedAt")
    private String finishedAt;

    @JsonProperty("message")
    private String message;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("signal")
    private Integer signal;

    @JsonProperty("startedAt")
    private String startedAt;
}
