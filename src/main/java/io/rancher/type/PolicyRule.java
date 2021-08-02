package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PolicyRule extends AbstractType {

    @JsonProperty("apiGroups")
    private List<String> apiGroups;

    @JsonProperty("nonResourceURLs")
    private List<String> nonResourceUrls;

    @JsonProperty("resourceNames")
    private List<String> resourceNames;

    @JsonProperty("resources")
    private List<String> resources;

    @JsonProperty("verbs")
    private List<String> verbs;
}
