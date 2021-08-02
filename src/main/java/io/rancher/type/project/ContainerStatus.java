package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ContainerStatus extends AbstractType {

    @JsonProperty("containerID")
    private String containerId;

    @JsonProperty("image")
    private String image;

    @JsonProperty("imageID")
    private String imageId;

    @JsonProperty("lastState")
    private ContainerState lastState;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ready")
    private Boolean ready;

    @JsonProperty("restartCount")
    private Integer restartCount;

    @JsonProperty("started")
    private Boolean started;

    @JsonProperty("state")
    private ContainerState state;
}
