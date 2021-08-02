package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BastionHost extends AbstractType {

    @JsonProperty("address")
    private String address;

    @JsonProperty("port")
    private String port;

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

    @JsonProperty("user")
    private String user;
}
