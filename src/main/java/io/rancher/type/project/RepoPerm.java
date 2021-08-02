package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RepoPerm extends AbstractType {

    @JsonProperty("admin")
    private Boolean admin;

    @JsonProperty("pull")
    private Boolean pull;

    @JsonProperty("push")
    private Boolean push;
}
