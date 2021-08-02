package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class AuthzConfig extends AbstractType {

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("options")
    private Map<String, Object> options;
}
