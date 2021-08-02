package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class KubeAPIService extends AbstractType {

    @JsonProperty("admissionConfiguration")
    private Map<String, Object> admissionConfiguration;

    @JsonProperty("alwaysPullImages")
    private Boolean alwaysPullImages;

    @JsonProperty("auditLog")
    private AuditLog auditLog;

    @JsonProperty("eventRateLimit")
    private EventRateLimit eventRateLimit;

    @JsonProperty("extraArgs")
    private Map<String, Object> extraArgs;

    @JsonProperty("extraBinds")
    private List<String> extraBinds;

    @JsonProperty("extraEnv")
    private List<String> extraEnv;

    @JsonProperty("image")
    private String image;

    @JsonProperty("podSecurityPolicy")
    private Boolean podSecurityPolicy;

    @JsonProperty("secretsEncryptionConfig")
    private SecretsEncryptionConfig secretsEncryptionConfig;

    @JsonProperty("serviceClusterIpRange")
    private String serviceClusterIpRange;

    @JsonProperty("serviceNodePortRange")
    private String serviceNodePortRange;

    @JsonProperty("winExtraArgs")
    private Map<String, Object> winExtraArgs;

    @JsonProperty("winExtraBinds")
    private List<String> winExtraBinds;

    @JsonProperty("winExtraEnv")
    private List<String> winExtraEnv;
}
