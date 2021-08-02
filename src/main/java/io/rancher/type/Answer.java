package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class Answer extends AbstractType {

    @JsonProperty("clusterId")
    private String clusterId;

    @JsonProperty("projectId")
    private String projectId;

    /**
     * required true
     */
    @JsonProperty("values")
    private Map<String, Object> values;
}
