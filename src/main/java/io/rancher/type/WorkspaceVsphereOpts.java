package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class WorkspaceVsphereOpts extends AbstractType {
    
    @JsonProperty("datacenter")
    private String datacenter;
    
    @JsonProperty("default-datastore")
    private String defaultDatastore;
    
    @JsonProperty("folder")
    private String folder;
    
    @JsonProperty("resourcepool-path")
    private String resourcepoolPath;
    
    @JsonProperty("server")
    private String server;
    
    public String getDatacenter() {
        return this.datacenter;
    }

    public void setDatacenter(String datacenter) {
      this.datacenter = datacenter;
    }
    
    public String getDefaultDatastore() {
        return this.defaultDatastore;
    }

    public void setDefaultDatastore(String defaultDatastore) {
      this.defaultDatastore = defaultDatastore;
    }
    
    public String getFolder() {
        return this.folder;
    }

    public void setFolder(String folder) {
      this.folder = folder;
    }
    
    public String getResourcepoolPath() {
        return this.resourcepoolPath;
    }

    public void setResourcepoolPath(String resourcepoolPath) {
      this.resourcepoolPath = resourcepoolPath;
    }
    
    public String getServer() {
        return this.server;
    }

    public void setServer(String server) {
      this.server = server;
    }
    
}
