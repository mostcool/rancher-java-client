package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ServiceOverride extends AbstractType {

    @JsonProperty("region")
    private String region;

    @JsonProperty("service")
    private String service;

    @JsonProperty("signing-method")
    private String signingMethod;

    @JsonProperty("signing-name")
    private String signingName;

    @JsonProperty("signing-region")
    private String signingRegion;

    @JsonProperty("url")
    private String url;
}
