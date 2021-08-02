package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Field extends AbstractType {

    @JsonProperty("create")
    private Boolean create;

    @JsonProperty("default")
    private Boolean defaultFlag;

    @JsonProperty("description")
    private String description;

    @JsonProperty("dynamicField")
    private Boolean dynamicField;

    @JsonProperty("invalidChars")
    private String invalidChars;

    @JsonProperty("max")
    private Integer max;

    @JsonProperty("maxLength")
    private Integer maxLength;

    @JsonProperty("min")
    private Integer min;

    @JsonProperty("minLength")
    private Integer minLength;

    @JsonProperty("nullable")
    private Boolean nullable;

    @JsonProperty("options")
    private List<String> options;

    @JsonProperty("required")
    private Boolean required;

    @JsonProperty("type")
    private String type;

    @JsonProperty("unique")
    private Boolean unique;

    @JsonProperty("update")
    private Boolean update;

    @JsonProperty("validChars")
    private String validChars;
}
