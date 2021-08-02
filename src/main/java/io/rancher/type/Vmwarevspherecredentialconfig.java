package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Vmwarevspherecredentialconfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("password")
    private String password;

    /**
     * required true
     */
    @JsonProperty("username")
    private String username;

    /**
     * required true
     */
    @JsonProperty("vcenter")
    private String vcenter;

    /**
     * required true
     */
    @JsonProperty("vcenterPort")
    private String vcenterPort;
}
