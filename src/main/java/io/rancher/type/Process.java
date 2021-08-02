package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Process extends AbstractType {

    @JsonProperty("args")
    private List<String> args;

    @JsonProperty("binds")
    private List<String> binds;

    @JsonProperty("command")
    private List<String> command;

    @JsonProperty("env")
    private List<String> env;

    @JsonProperty("healthCheck")
    private HealthCheck healthCheck;

    @JsonProperty("image")
    private String image;

    @JsonProperty("imageRegistryAuthConfig")
    private String imageRegistryAuthConfig;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("networkMode")
    private String networkMode;

    @JsonProperty("pidMode")
    private String pidMode;

    @JsonProperty("privileged")
    private Boolean privileged;

    @JsonProperty("publish")
    private List<String> publish;

    @JsonProperty("restartPolicy")
    private String restartPolicy;

    @JsonProperty("user")
    private String user;

    @JsonProperty("volumesFrom")
    private List<String> volumesFrom;
}
