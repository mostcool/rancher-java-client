package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Step extends AbstractType {

    @JsonProperty("applyAppConfig")
    private ApplyAppConfig applyAppConfig;

    @JsonProperty("applyYamlConfig")
    private ApplyYamlConfig applyYamlConfig;

    @JsonProperty("cpuLimit")
    private String cpuLimit;

    @JsonProperty("cpuRequest")
    private String cpuRequest;

    @JsonProperty("env")
    private Map<String, Object> env;

    @JsonProperty("envFrom")
    private List<EnvFrom> envFrom;

    @JsonProperty("memoryLimit")
    private String memoryLimit;

    @JsonProperty("memoryRequest")
    private String memoryRequest;

    @JsonProperty("privileged")
    private Boolean privileged;

    @JsonProperty("publishCatalogConfig")
    private PublishCatalogConfig publishCatalogConfig;

    @JsonProperty("publishImageConfig")
    private PublishImageConfig publishImageConfig;

    @JsonProperty("runScriptConfig")
    private RunScriptConfig runScriptConfig;

    @JsonProperty("sourceCodeConfig")
    private SourceCodeConfig sourceCodeConfig;

    @JsonProperty("when")
    private Constraints when;
}
