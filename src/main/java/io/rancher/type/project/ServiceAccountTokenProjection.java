package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ServiceAccountTokenProjection extends AbstractType {

    @JsonProperty("audience")
    private String audience;

    @JsonProperty("expirationSeconds")
    private Integer expirationSeconds;

    @JsonProperty("path")
    private String path;
}
