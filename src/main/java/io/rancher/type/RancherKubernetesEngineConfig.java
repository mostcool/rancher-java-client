package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RancherKubernetesEngineConfig extends AbstractType {

    @JsonProperty("addonJobTimeout")
    private Integer addonJobTimeout;

    @JsonProperty("addons")
    private String addons;

    @JsonProperty("addonsInclude")
    private List<String> addonsInclude;

    @JsonProperty("authentication")
    private AuthnConfig authentication;

    @JsonProperty("authorization")
    private AuthzConfig authorization;

    @JsonProperty("bastionHost")
    private BastionHost bastionHost;

    @JsonProperty("cloudProvider")
    private CloudProvider cloudProvider;

    @JsonProperty("clusterName")
    private String clusterName;

    @JsonProperty("dns")
    private DnsConfig dns;

    @JsonProperty("ignoreDockerVersion")
    private Boolean ignoreDockerVersion;

    @JsonProperty("ingress")
    private IngressConfig ingress;

    @JsonProperty("kubernetesVersion")
    private String kubernetesVersion;

    @JsonProperty("monitoring")
    private MonitoringConfig monitoring;

    @JsonProperty("network")
    private NetworkConfig network;

    @JsonProperty("nodes")
    private List<RkeConfigNode> nodes;

    @JsonProperty("prefixPath")
    private String prefixPath;

    @JsonProperty("privateRegistries")
    private List<PrivateRegistry> privateRegistries;

    @JsonProperty("restore")
    private RestoreConfig restore;

    @JsonProperty("rotateCertificates")
    private RotateCertificates rotateCertificates;

    @JsonProperty("services")
    private RkeConfigServices services;

    @JsonProperty("sshAgentAuth")
    private Boolean sshAgentAuth;

    @JsonProperty("sshCertPath")
    private String sshCertPath;

    @JsonProperty("sshKeyPath")
    private String sshKeyPath;

    @JsonProperty("upgradeStrategy")
    private NodeUpgradeStrategy upgradeStrategy;

    @JsonProperty("winPrefixPath")
    private String winPrefixPath;
}
