package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class QueryProjectGraphOutput extends AbstractType {

    @JsonProperty("data")
    private List<QueryProjectGraph> data;

    @JsonProperty("type")
    private String type;
}
