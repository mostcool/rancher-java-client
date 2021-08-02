package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ContainerResourceLimit extends AbstractType {

    @JsonProperty("limitsCpu")
    private String limitsCpu;

    @JsonProperty("limitsMemory")
    private String limitsMemory;

    @JsonProperty("requestsCpu")
    private String requestsCpu;

    @JsonProperty("requestsMemory")
    private String requestsMemory;
}
