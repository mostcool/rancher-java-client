package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class KubeletService extends AbstractType {

    @JsonProperty("clusterDnsServer")
    private String clusterDnsServer;

    @JsonProperty("clusterDomain")
    private String clusterDomain;

    @JsonProperty("extraArgs")
    private Map<String, Object> extraArgs;

    @JsonProperty("extraBinds")
    private List<String> extraBinds;

    @JsonProperty("extraEnv")
    private List<String> extraEnv;

    @JsonProperty("failSwapOn")
    private Boolean failSwapOn;

    @JsonProperty("generateServingCertificate")
    private Boolean generateServingCertificate;

    @JsonProperty("image")
    private String image;

    @JsonProperty("infraContainerImage")
    private String infraContainerImage;

    @JsonProperty("winExtraArgs")
    private Map<String, Object> winExtraArgs;

    @JsonProperty("winExtraBinds")
    private List<String> winExtraBinds;

    @JsonProperty("winExtraEnv")
    private List<String> winExtraEnv;
}
