package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class StringMatch extends AbstractType {

    @JsonProperty("exact")
    private String exact;

    @JsonProperty("prefix")
    private String prefix;

    @JsonProperty("regex")
    private String regex;

    @JsonProperty("suffix")
    private String suffix;
}
