package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResourceFieldSelector extends AbstractType {

    @JsonProperty("containerName")
    private String containerName;

    @JsonProperty("divisor")
    private String divisor;

    @JsonProperty("resource")
    private String resource;
}
