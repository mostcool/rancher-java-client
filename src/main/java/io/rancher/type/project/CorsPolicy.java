package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class CorsPolicy extends AbstractType {

    @JsonProperty("allowCredentials")
    private Boolean allowCredentials;

    @JsonProperty("allowHeaders")
    private List<String> allowHeaders;

    @JsonProperty("allowMethods")
    private List<String> allowMethods;

    @JsonProperty("allowOrigin")
    private List<String> allowOrigin;

    @JsonProperty("exposeHeaders")
    private List<String> exposeHeaders;

    @JsonProperty("maxAge")
    private String maxAge;
}
