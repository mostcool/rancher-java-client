package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Subscribe extends AbstractType {

    @JsonProperty("apiVersions")
    private List<String> apiVersions;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("resourceTypes")
    private List<String> resourceTypes;
}
