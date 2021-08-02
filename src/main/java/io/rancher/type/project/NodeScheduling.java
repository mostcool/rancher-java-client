package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class NodeScheduling extends AbstractType {

    @JsonProperty("nodeId")
    private String nodeId;

    @JsonProperty("preferred")
    private List<String> preferred;

    @JsonProperty("requireAll")
    private List<String> requireAll;

    @JsonProperty("requireAny")
    private List<String> requireAny;
}
