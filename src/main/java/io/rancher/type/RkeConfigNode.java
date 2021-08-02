package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class RkeConfigNode extends AbstractType {

    @JsonProperty("address")
    private String address;

    @JsonProperty("dockerSocket")
    private String dockerSocket;

    @JsonProperty("hostnameOverride")
    private String hostnameOverride;

    @JsonProperty("internalAddress")
    private String internalAddress;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("nodeId")
    private String nodeId;

    @JsonProperty("port")
    private String port;

    @JsonProperty("role")
    private List<String> role;

    @JsonProperty("sshAgentAuth")
    private Boolean sshAgentAuth;

    @JsonProperty("sshCert")
    private String sshCert;

    @JsonProperty("sshCertPath")
    private String sshCertPath;

    @JsonProperty("sshKey")
    private String sshKey;

    @JsonProperty("sshKeyPath")
    private String sshKeyPath;

    @JsonProperty("taints")
    private List<RkeTaint> taints;

    @JsonProperty("user")
    private String user;
}
