package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class QueryClusterGraph extends AbstractType {

    @JsonProperty("graphID")
    private String graphId;

    @JsonProperty("series")
    private List<String> series;
}
