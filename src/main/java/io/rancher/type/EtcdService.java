package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

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
    
    public BackupConfig getBackupConfig() {
        return this.backupConfig;
    }

    public void setBackupConfig(BackupConfig backupConfig) {
      this.backupConfig = backupConfig;
    }
    
    public String getCaCert() {
        return this.caCert;
    }

    public void setCaCert(String caCert) {
      this.caCert = caCert;
    }
    
    public String getCert() {
        return this.cert;
    }

    public void setCert(String cert) {
      this.cert = cert;
    }
    
    public String getCreation() {
        return this.creation;
    }

    public void setCreation(String creation) {
      this.creation = creation;
    }
    
    public List<String> getExternalUrls() {
        return this.externalUrls;
    }

    public void setExternalUrls(List<String> externalUrls) {
      this.externalUrls = externalUrls;
    }
    
    public Map<String, Object> getExtraArgs() {
        return this.extraArgs;
    }

    public void setExtraArgs(Map<String, Object> extraArgs) {
      this.extraArgs = extraArgs;
    }
    
    public List<String> getExtraBinds() {
        return this.extraBinds;
    }

    public void setExtraBinds(List<String> extraBinds) {
      this.extraBinds = extraBinds;
    }
    
    public List<String> getExtraEnv() {
        return this.extraEnv;
    }

    public void setExtraEnv(List<String> extraEnv) {
      this.extraEnv = extraEnv;
    }
    
    public Integer getGid() {
        return this.gid;
    }

    public void setGid(Integer gid) {
      this.gid = gid;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public String getRetention() {
        return this.retention;
    }

    public void setRetention(String retention) {
      this.retention = retention;
    }
    
    public Boolean getSnapshot() {
        return this.snapshot;
    }

    public void setSnapshot(Boolean snapshot) {
      this.snapshot = snapshot;
    }
    
    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
      this.uid = uid;
    }
    
    public Map<String, Object> getWinExtraArgs() {
        return this.winExtraArgs;
    }

    public void setWinExtraArgs(Map<String, Object> winExtraArgs) {
      this.winExtraArgs = winExtraArgs;
    }
    
    public List<String> getWinExtraBinds() {
        return this.winExtraBinds;
    }

    public void setWinExtraBinds(List<String> winExtraBinds) {
      this.winExtraBinds = winExtraBinds;
    }
    
    public List<String> getWinExtraEnv() {
        return this.winExtraEnv;
    }

    public void setWinExtraEnv(List<String> winExtraEnv) {
      this.winExtraEnv = winExtraEnv;
    }
    
}
