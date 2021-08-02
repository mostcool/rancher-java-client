package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class ResourceRequirements extends AbstractType {

    @JsonProperty("limits")
    private Map<String, Object> limits;

    @JsonProperty("requests")
    private Map<String, Object> requests;
}
