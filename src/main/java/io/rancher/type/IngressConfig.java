package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class IngressConfig extends AbstractType {

    @JsonProperty("dnsPolicy")
    private String dnsPolicy;

    @JsonProperty("extraArgs")
    private Map<String, Object> extraArgs;

    @JsonProperty("extraEnvs")
    private List<Map<String, Object>> extraEnvs;

    @JsonProperty("extraVolumeMounts")
    private List<Map<String, Object>> extraVolumeMounts;

    @JsonProperty("extraVolumes")
    private List<Map<String, Object>> extraVolumes;

    @JsonProperty("nodeSelector")
    private Map<String, Object> nodeSelector;

    @JsonProperty("options")
    private Map<String, Object> options;

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("updateStrategy")
    private DaemonSetUpdateStrategy updateStrategy;
}
