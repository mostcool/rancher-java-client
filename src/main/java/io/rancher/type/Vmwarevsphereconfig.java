package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Vmwarevsphereconfig extends AbstractType {

    @JsonProperty("boot2dockerUrl")
    private String boot2dockerUrl;

    @JsonProperty("cfgparam")
    private List<String> cfgparam;

    @JsonProperty("cloneFrom")
    private String cloneFrom;

    @JsonProperty("cloudConfig")
    private String cloudConfig;

    @JsonProperty("cloudinit")
    private String cloudinit;

    @JsonProperty("contentLibrary")
    private String contentLibrary;

    @JsonProperty("cpuCount")
    private String cpuCount;

    @JsonProperty("creationType")
    private String creationType;

    @JsonProperty("customAttribute")
    private List<String> customAttribute;

    @JsonProperty("datacenter")
    private String datacenter;

    @JsonProperty("datastore")
    private String datastore;

    @JsonProperty("datastoreCluster")
    private String datastoreCluster;

    @JsonProperty("diskSize")
    private String diskSize;

    @JsonProperty("folder")
    private String folder;

    @JsonProperty("hostsystem")
    private String hostsystem;

    @JsonProperty("memorySize")
    private String memorySize;

    @JsonProperty("network")
    private List<String> network;

    @JsonProperty("password")
    private String password;

    @JsonProperty("pool")
    private String pool;

    @JsonProperty("sshPassword")
    private String sshPassword;

    @JsonProperty("sshPort")
    private String sshPort;

    @JsonProperty("sshUser")
    private String sshUser;

    @JsonProperty("sshUserGroup")
    private String sshUserGroup;

    @JsonProperty("tag")
    private List<String> tag;

    @JsonProperty("username")
    private String username;

    @JsonProperty("vappIpallocationpolicy")
    private String vappIpallocationpolicy;

    @JsonProperty("vappIpprotocol")
    private String vappIpprotocol;

    @JsonProperty("vappProperty")
    private List<String> vappProperty;

    @JsonProperty("vappTransport")
    private String vappTransport;

    @JsonProperty("vcenter")
    private String vcenter;

    @JsonProperty("vcenterPort")
    private String vcenterPort;
}
