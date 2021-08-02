package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EventRule extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("eventType")
    private String eventType;

    /**
     * required true
     */
    @JsonProperty("resourceKind")
    private String resourceKind;
}
