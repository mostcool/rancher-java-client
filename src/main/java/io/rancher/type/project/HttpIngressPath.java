package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class HttpIngressPath extends AbstractType {

    @JsonProperty("path")
    private String path;

    @JsonProperty("pathType")
    private String pathType;

    @JsonProperty("resource")
    private TypedLocalObjectReference resource;

    @JsonProperty("serviceId")
    private String serviceId;

    @JsonProperty("targetPort")
    private String targetPort;

    @JsonProperty("workloadIds")
    private List<String> workloadIds;
}
