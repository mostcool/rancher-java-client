package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Digitaloceanconfig extends AbstractType {

    @JsonProperty("accessToken")
    private String accessToken;

    @JsonProperty("backups")
    private Boolean backups;

    @JsonProperty("image")
    private String image;

    @JsonProperty("ipv6")
    private Boolean ipv6;

    @JsonProperty("monitoring")
    private Boolean monitoring;

    @JsonProperty("privateNetworking")
    private Boolean privateNetworking;

    @JsonProperty("region")
    private String region;

    @JsonProperty("size")
    private String size;

    @JsonProperty("sshKeyContents")
    private String sshKeyContents;

    @JsonProperty("sshKeyFingerprint")
    private String sshKeyFingerprint;

    @JsonProperty("sshPort")
    private String sshPort;

    @JsonProperty("sshUser")
    private String sshUser;

    @JsonProperty("tags")
    private String tags;

    @JsonProperty("userdata")
    private String userdata;
}
