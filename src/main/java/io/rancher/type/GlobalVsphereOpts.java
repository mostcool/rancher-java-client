package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

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
    
    public String getDatacenter() {
        return this.datacenter;
    }

    public void setDatacenter(String datacenter) {
      this.datacenter = datacenter;
    }
    
    public String getDatacenters() {
        return this.datacenters;
    }

    public void setDatacenters(String datacenters) {
      this.datacenters = datacenters;
    }
    
    public String getDatastore() {
        return this.datastore;
    }

    public void setDatastore(String datastore) {
      this.datastore = datastore;
    }
    
    public Boolean getInsecureFlag() {
        return this.insecureFlag;
    }

    public void setInsecureFlag(Boolean insecureFlag) {
      this.insecureFlag = insecureFlag;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
      this.port = port;
    }
    
    public String getServer() {
        return this.server;
    }

    public void setServer(String server) {
      this.server = server;
    }
    
    public Integer getSoapRoundtripCount() {
        return this.soapRoundtripCount;
    }

    public void setSoapRoundtripCount(Integer soapRoundtripCount) {
      this.soapRoundtripCount = soapRoundtripCount;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
    public String getVmName() {
        return this.vmName;
    }

    public void setVmName(String vmName) {
      this.vmName = vmName;
    }
    
    public String getVmUuid() {
        return this.vmUuid;
    }

    public void setVmUuid(String vmUuid) {
      this.vmUuid = vmUuid;
    }
    
    public String getWorkingDir() {
        return this.workingDir;
    }

    public void setWorkingDir(String workingDir) {
      this.workingDir = workingDir;
    }
    
}
