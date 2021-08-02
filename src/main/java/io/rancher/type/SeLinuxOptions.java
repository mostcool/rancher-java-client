package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SeLinuxOptions extends AbstractType {

    @JsonProperty("level")
    private String level;

    @JsonProperty("role")
    private String role;

    @JsonProperty("type")
    private String type;

    @JsonProperty("user")
    private String user;
}
