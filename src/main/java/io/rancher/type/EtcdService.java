package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class EtcdService extends AbstractType {

    @JsonProperty("backupConfig")
    private BackupConfig backupConfig;

    @JsonProperty("caCert")
    private String caCert;

    @JsonProperty("cert")
    private String cert;

    @JsonProperty("creation")
    private String creation;

    @JsonProperty("externalUrls")
    private List<String> externalUrls;

    @JsonProperty("extraArgs")
    private Map<String, Object> extraArgs;

    @JsonProperty("extraBinds")
    private List<String> extraBinds;

    @JsonProperty("extraEnv")
    private List<String> extraEnv;

    @JsonProperty("gid")
    private Integer gid;

    @JsonProperty("image")
    private String image;

    @JsonProperty("key")
    private String key;

    @JsonProperty("path")
    private String path;

    @JsonProperty("retention")
    private String retention;

    @JsonProperty("snapshot")
    private Boolean snapshot;

    @JsonProperty("uid")
    private Integer uid;

    @JsonProperty("winExtraArgs")
    private Map<String, Object> winExtraArgs;

    @JsonProperty("winExtraBinds")
    private List<String> winExtraBinds;

    @JsonProperty("winExtraEnv")
    private List<String> winExtraEnv;
}
