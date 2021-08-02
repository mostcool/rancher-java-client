package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class CisBenchmarkVersionInfo extends AbstractType {

    @JsonProperty("managed")
    private Boolean managed;

    @JsonProperty("minKubernetesVersion")
    private String minKubernetesVersion;

    @JsonProperty("notApplicableChecks")
    private Map<String, Object> notApplicableChecks;

    @JsonProperty("skippedChecks")
    private Map<String, Object> skippedChecks;
}
