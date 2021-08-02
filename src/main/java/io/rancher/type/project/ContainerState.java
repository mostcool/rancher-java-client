package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ContainerState extends AbstractType {

    @JsonProperty("running")
    private ContainerStateRunning running;

    @JsonProperty("terminated")
    private ContainerStateTerminated terminated;

    @JsonProperty("waiting")
    private ContainerStateWaiting waiting;
}
