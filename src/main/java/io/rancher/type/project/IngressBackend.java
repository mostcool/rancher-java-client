package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class IngressBackend extends AbstractType {

    @JsonProperty("resource")
    private TypedLocalObjectReference resource;

    @JsonProperty("serviceId")
    private String serviceId;

    @JsonProperty("targetPort")
    private Integer targetPort;

    @JsonProperty("workloadIds")
    private List<String> workloadIds;
}
