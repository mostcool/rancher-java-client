package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RollingUpdateDeployment extends AbstractType {

    @JsonProperty("maxSurge")
    private String maxSurge;

    @JsonProperty("maxUnavailable")
    private String maxUnavailable;
}
