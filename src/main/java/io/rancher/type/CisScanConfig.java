package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class CisScanConfig extends AbstractType {

    @JsonProperty("debugMaster")
    private Boolean debugMaster;

    @JsonProperty("debugWorker")
    private Boolean debugWorker;

    @JsonProperty("overrideBenchmarkVersion")
    private String overrideBenchmarkVersion;

    @JsonProperty("overrideSkip")
    private List<String> overrideSkip;

    /**
     * required true
     */
    @JsonProperty("profile")
    private String profile;
}
