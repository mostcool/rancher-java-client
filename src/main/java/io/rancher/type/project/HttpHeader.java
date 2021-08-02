package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HttpHeader extends AbstractType {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private String value;
}
