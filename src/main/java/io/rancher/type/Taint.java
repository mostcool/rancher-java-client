package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Taint extends AbstractType {

    @JsonProperty("effect")
    private String effect;

    @JsonProperty("key")
    private String key;

    @JsonProperty("timeAdded")
    private String timeAdded;

    @JsonProperty("value")
    private String value;
}
