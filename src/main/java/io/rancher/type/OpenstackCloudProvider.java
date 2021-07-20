package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class OpenstackCloudProvider extends AbstractType {
    
    @JsonProperty("blockStorage")
    private BlockStorageOpenstackOpts blockStorage;
    
    @JsonProperty("global")
    private GlobalOpenstackOpts global;
    
    @JsonProperty("loadBalancer")
    private LoadBalancerOpenstackOpts loadBalancer;
    
    @JsonProperty("metadata")
    private MetadataOpenstackOpts metadata;
    
    @JsonProperty("route")
    private RouteOpenstackOpts route;
    
    public BlockStorageOpenstackOpts getBlockStorage() {
        return this.blockStorage;
    }

    public void setBlockStorage(BlockStorageOpenstackOpts blockStorage) {
      this.blockStorage = blockStorage;
    }
    
    public GlobalOpenstackOpts getGlobal() {
        return this.global;
    }

    public void setGlobal(GlobalOpenstackOpts global) {
      this.global = global;
    }
    
    public LoadBalancerOpenstackOpts getLoadBalancer() {
        return this.loadBalancer;
    }

    public void setLoadBalancer(LoadBalancerOpenstackOpts loadBalancer) {
      this.loadBalancer = loadBalancer;
    }
    
    public MetadataOpenstackOpts getMetadata() {
        return this.metadata;
    }

    public void setMetadata(MetadataOpenstackOpts metadata) {
      this.metadata = metadata;
    }
    
    public RouteOpenstackOpts getRoute() {
        return this.route;
    }

    public void setRoute(RouteOpenstackOpts route) {
      this.route = route;
    }
    
}
