package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class HeaderOperations extends AbstractType {

    @JsonProperty("add")
    private Map<String, Object> add;

    @JsonProperty("remove")
    private List<String> remove;

    @JsonProperty("set")
    private Map<String, Object> set;
}
