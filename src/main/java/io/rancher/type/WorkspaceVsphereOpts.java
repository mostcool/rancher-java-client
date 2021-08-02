package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
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
}
