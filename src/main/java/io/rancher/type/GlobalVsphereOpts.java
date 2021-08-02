package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GlobalVsphereOpts extends AbstractType {

    @JsonProperty("datacenter")
    private String datacenter;

    @JsonProperty("datacenters")
    private String datacenters;

    @JsonProperty("datastore")
    private String datastore;

    @JsonProperty("insecure-flag")
    private Boolean insecureFlag;

    @JsonProperty("password")
    private String password;

    @JsonProperty("port")
    private String port;

    @JsonProperty("server")
    private String server;

    @JsonProperty("soap-roundtrip-count")
    private Integer soapRoundtripCount;

    @JsonProperty("user")
    private String user;

    @JsonProperty("vm-name")
    private String vmName;

    @JsonProperty("vm-uuid")
    private String vmUuid;

    @JsonProperty("working-dir")
    private String workingDir;
}
