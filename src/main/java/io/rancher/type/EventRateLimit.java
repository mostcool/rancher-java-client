package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class EventRateLimit extends AbstractType {

    @JsonProperty("configuration")
    private Map<String, Object> configuration;

    @JsonProperty("enabled")
    private Boolean enabled;
}
