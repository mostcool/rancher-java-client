package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class FluentServer extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("password")
    private String password;

    @JsonProperty("sharedKey")
    private String sharedKey;

    @JsonProperty("standby")
    private Boolean standby;

    @JsonProperty("username")
    private String username;

    @JsonProperty("weight")
    private Integer weight;
}
