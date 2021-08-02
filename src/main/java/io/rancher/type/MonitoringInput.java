package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class MonitoringInput extends AbstractType {

    @JsonProperty("answers")
    private Map<String, Object> answers;

    @JsonProperty("version")
    private String version;
}
