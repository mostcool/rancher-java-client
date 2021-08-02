package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
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
}
