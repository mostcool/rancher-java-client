package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AllowedHostPath extends AbstractType {

    @JsonProperty("pathPrefix")
    private String pathPrefix;

    @JsonProperty("readOnly")
    private Boolean readOnly;
}
