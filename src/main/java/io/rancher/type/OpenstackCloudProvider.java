package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
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
}
