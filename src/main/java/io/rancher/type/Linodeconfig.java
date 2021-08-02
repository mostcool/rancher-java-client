package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Linodeconfig extends AbstractType {

    @JsonProperty("authorizedUsers")
    private String authorizedUsers;

    @JsonProperty("createPrivateIp")
    private Boolean createPrivateIp;

    @JsonProperty("dockerPort")
    private String dockerPort;

    @JsonProperty("image")
    private String image;

    @JsonProperty("instanceType")
    private String instanceType;

    @JsonProperty("label")
    private String label;

    @JsonProperty("region")
    private String region;

    @JsonProperty("rootPass")
    private String rootPass;

    @JsonProperty("sshPort")
    private String sshPort;

    @JsonProperty("sshUser")
    private String sshUser;

    @JsonProperty("stackscript")
    private String stackscript;

    @JsonProperty("stackscriptData")
    private String stackscriptData;

    @JsonProperty("swapSize")
    private String swapSize;

    @JsonProperty("tags")
    private String tags;

    @JsonProperty("token")
    private String token;

    @JsonProperty("uaPrefix")
    private String uaPrefix;
}
