package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class MetricNamesOutput extends AbstractType {

    @JsonProperty("names")
    private List<String> names;

    @JsonProperty("type")
    private String type;
}
