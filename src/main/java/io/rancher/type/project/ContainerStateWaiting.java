package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ContainerStateWaiting extends AbstractType {

    @JsonProperty("message")
    private String message;

    @JsonProperty("reason")
    private String reason;
}
