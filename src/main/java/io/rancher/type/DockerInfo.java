package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

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
    
    public String getArchitecture() {
        return this.architecture;
    }

    public void setArchitecture(String architecture) {
      this.architecture = architecture;
    }
    
    public String getCgroupDriver() {
        return this.cgroupDriver;
    }

    public void setCgroupDriver(String cgroupDriver) {
      this.cgroupDriver = cgroupDriver;
    }
    
    public Boolean getDebug() {
        return this.debug;
    }

    public void setDebug(Boolean debug) {
      this.debug = debug;
    }
    
    public String getDockerRootDir() {
        return this.dockerRootDir;
    }

    public void setDockerRootDir(String dockerRootDir) {
      this.dockerRootDir = dockerRootDir;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Boolean getExperimentalBuild() {
        return this.experimentalBuild;
    }

    public void setExperimentalBuild(Boolean experimentalBuild) {
      this.experimentalBuild = experimentalBuild;
    }
    
    public String getHttpProxy() {
        return this.httpProxy;
    }

    public void setHttpProxy(String httpProxy) {
      this.httpProxy = httpProxy;
    }
    
    public String getHttpsProxy() {
        return this.httpsProxy;
    }

    public void setHttpsProxy(String httpsProxy) {
      this.httpsProxy = httpsProxy;
    }
    
    public String getIndexServerAddress() {
        return this.indexServerAddress;
    }

    public void setIndexServerAddress(String indexServerAddress) {
      this.indexServerAddress = indexServerAddress;
    }
    
    public String getInitBinary() {
        return this.initBinary;
    }

    public void setInitBinary(String initBinary) {
      this.initBinary = initBinary;
    }
    
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
      this.kernelVersion = kernelVersion;
    }
    
    public List<String> getLabels() {
        return this.labels;
    }

    public void setLabels(List<String> labels) {
      this.labels = labels;
    }
    
    public String getLoggingDriver() {
        return this.loggingDriver;
    }

    public void setLoggingDriver(String loggingDriver) {
      this.loggingDriver = loggingDriver;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNoProxy() {
        return this.noProxy;
    }

    public void setNoProxy(String noProxy) {
      this.noProxy = noProxy;
    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
    }
    
    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String osType) {
      this.osType = osType;
    }
    
    public List<String> getSecurityOptions() {
        return this.securityOptions;
    }

    public void setSecurityOptions(List<String> securityOptions) {
      this.securityOptions = securityOptions;
    }
    
    public String getServerVersion() {
        return this.serverVersion;
    }

    public void setServerVersion(String serverVersion) {
      this.serverVersion = serverVersion;
    }
    
}
