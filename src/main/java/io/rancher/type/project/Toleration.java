package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Toleration extends AbstractType {

    @JsonProperty("effect")
    private String effect;

    @JsonProperty("key")
    private String key;

    @JsonProperty("operator")
    private String operator;

    @JsonProperty("tolerationSeconds")
    private Integer tolerationSeconds;

    @JsonProperty("value")
    private String value;
}
