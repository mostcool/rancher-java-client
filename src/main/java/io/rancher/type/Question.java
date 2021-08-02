package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Question extends AbstractType {

    @JsonProperty("default")
    private Boolean defaultFlag;

    @JsonProperty("description")
    private String description;

    @JsonProperty("group")
    private String group;

    @JsonProperty("invalidChars")
    private String invalidChars;

    @JsonProperty("label")
    private String label;

    @JsonProperty("max")
    private Integer max;

    @JsonProperty("maxLength")
    private Integer maxLength;

    @JsonProperty("min")
    private Integer min;

    @JsonProperty("minLength")
    private Integer minLength;

    @JsonProperty("options")
    private List<String> options;

    @JsonProperty("required")
    private Boolean required;

    @JsonProperty("satisfies")
    private String satisfies;

    @JsonProperty("showIf")
    private String showIf;

    @JsonProperty("showSubquestionIf")
    private String showSubquestionIf;

    @JsonProperty("subquestions")
    private List<SubQuestion> subquestions;

    @JsonProperty("type")
    private String type;

    @JsonProperty("validChars")
    private String validChars;

    @JsonProperty("variable")
    private String variable;
}
