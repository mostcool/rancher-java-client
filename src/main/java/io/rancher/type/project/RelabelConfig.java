package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RelabelConfig extends AbstractType {

    @JsonProperty("action")
    private String action;

    @JsonProperty("modulus")
    private Integer modulus;

    @JsonProperty("regex")
    private String regex;

    @JsonProperty("replacement")
    private String replacement;

    @JsonProperty("separator")
    private String separator;

    @JsonProperty("sourceLabels")
    private List<String> sourceLabels;

    @JsonProperty("targetLabel")
    private String targetLabel;
}
