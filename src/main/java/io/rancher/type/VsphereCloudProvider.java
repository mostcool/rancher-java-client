package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.Map;

public class VsphereCloudProvider extends AbstractType {
    
    @JsonProperty("disk")
    private DiskVsphereOpts disk;
    
    @JsonProperty("global")
    private GlobalVsphereOpts global;
    
    @JsonProperty("network")
    private NetworkVshpereOpts network;
    
    @JsonProperty("virtualCenter")
    private Map<String, Object> virtualCenter;
    
    @JsonProperty("workspace")
    private WorkspaceVsphereOpts workspace;
    
    public DiskVsphereOpts getDisk() {
        return this.disk;
    }

    public void setDisk(DiskVsphereOpts disk) {
      this.disk = disk;
    }
    
    public GlobalVsphereOpts getGlobal() {
        return this.global;
    }

    public void setGlobal(GlobalVsphereOpts global) {
      this.global = global;
    }
    
    public NetworkVshpereOpts getNetwork() {
        return this.network;
    }

    public void setNetwork(NetworkVshpereOpts network) {
      this.network = network;
    }
    
    public Map<String, Object> getVirtualCenter() {
        return this.virtualCenter;
    }

    public void setVirtualCenter(Map<String, Object> virtualCenter) {
      this.virtualCenter = virtualCenter;
    }
    
    public WorkspaceVsphereOpts getWorkspace() {
        return this.workspace;
    }

    public void setWorkspace(WorkspaceVsphereOpts workspace) {
      this.workspace = workspace;
    }
    
}
