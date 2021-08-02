package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RbdVolumeSource extends AbstractType {

    @JsonProperty("fsType")
    private String fsType;

    @JsonProperty("image")
    private String image;

    @JsonProperty("keyring")
    private String keyring;

    @JsonProperty("monitors")
    private List<String> monitors;

    @JsonProperty("pool")
    private String pool;

    @JsonProperty("readOnly")
    private Boolean readOnly;

    @JsonProperty("secretRef")
    private LocalObjectReference secretRef;

    @JsonProperty("user")
    private String user;
}
