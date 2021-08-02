package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class DockerInfo extends AbstractType {

    @JsonProperty("architecture")
    private String architecture;

    @JsonProperty("cgroupDriver")
    private String cgroupDriver;

    @JsonProperty("debug")
    private Boolean debug;

    @JsonProperty("dockerRootDir")
    private String dockerRootDir;

    @JsonProperty("driver")
    private String driver;

    @JsonProperty("experimentalBuild")
    private Boolean experimentalBuild;

    @JsonProperty("httpProxy")
    private String httpProxy;

    @JsonProperty("httpsProxy")
    private String httpsProxy;

    @JsonProperty("indexServerAddress")
    private String indexServerAddress;

    @JsonProperty("initBinary")
    private String initBinary;

    @JsonProperty("kernelVersion")
    private String kernelVersion;

    @JsonProperty("labels")
    private List<String> labels;

    @JsonProperty("loggingDriver")
    private String loggingDriver;

    @JsonProperty("name")
    private String name;

    @JsonProperty("noProxy")
    private String noProxy;

    @JsonProperty("operatingSystem")
    private String operatingSystem;

    @JsonProperty("osType")
    private String osType;

    @JsonProperty("securityOptions")
    private List<String> securityOptions;

    @JsonProperty("serverVersion")
    private String serverVersion;
}
