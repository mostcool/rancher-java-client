package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Target extends AbstractType {

    @JsonProperty("appId")
    private String appId;

    @JsonProperty("healthState")
    private String healthState;

    /**
     * required true
     */
    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("state")
    private String state;
}
