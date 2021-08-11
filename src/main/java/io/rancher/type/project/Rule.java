package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class Rule extends AbstractType {

    @JsonProperty("alert")
    private String alert;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("expr")
    private String exprFlag;

    @JsonProperty("for")
    private String forFlag;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("record")
    private String record;
}
