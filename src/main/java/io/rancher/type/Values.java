package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Values extends AbstractType {

    @JsonProperty("boolValue")
    private Boolean boolValue;

    @JsonProperty("intValue")
    private Integer intValue;

    @JsonProperty("stringSliceValue")
    private List<String> stringSliceValue;

    @JsonProperty("stringValue")
    private String stringValue;
}
