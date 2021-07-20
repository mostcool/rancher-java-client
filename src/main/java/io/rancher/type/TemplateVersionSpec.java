package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class TemplateVersionSpec extends AbstractType {
    
    @JsonProperty("appReadme")
    private String appReadme;
    
    @JsonProperty("digest")
    private String digest;
    
    @JsonProperty("externalId")
    private String externalId;
    
    @JsonProperty("files")
    private Map<String, Object> files;
    
    @JsonProperty("kubeVersion")
    private String kubeVersion;
    
    @JsonProperty("questions")
    private List<Question> questions;
    
    @JsonProperty("rancherMaxVersion")
    private String rancherMaxVersion;
    
    @JsonProperty("rancherMinVersion")
    private String rancherMinVersion;
    
    @JsonProperty("rancherVersion")
    private String rancherVersion;
    
    @JsonProperty("readme")
    private String readme;
    
    @JsonProperty("requiredNamespace")
    private String requiredNamespace;
    
    @JsonProperty("upgradeVersionLinks")
    private Map<String, Object> upgradeVersionLinks;
    
    @JsonProperty("version")
    private String version;
    
    @JsonProperty("versionDir")
    private String versionDir;
    
    @JsonProperty("versionName")
    private String versionName;
    
    @JsonProperty("versionUrls")
    private List<String> versionUrls;
    
    public String getAppReadme() {
        return this.appReadme;
    }

    public void setAppReadme(String appReadme) {
      this.appReadme = appReadme;
    }
    
    public String getDigest() {
        return this.digest;
    }

    public void setDigest(String digest) {
      this.digest = digest;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public Map<String, Object> getFiles() {
        return this.files;
    }

    public void setFiles(Map<String, Object> files) {
      this.files = files;
    }
    
    public String getKubeVersion() {
        return this.kubeVersion;
    }

    public void setKubeVersion(String kubeVersion) {
      this.kubeVersion = kubeVersion;
    }
    
    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
      this.questions = questions;
    }
    
    public String getRancherMaxVersion() {
        return this.rancherMaxVersion;
    }

    public void setRancherMaxVersion(String rancherMaxVersion) {
      this.rancherMaxVersion = rancherMaxVersion;
    }
    
    public String getRancherMinVersion() {
        return this.rancherMinVersion;
    }

    public void setRancherMinVersion(String rancherMinVersion) {
      this.rancherMinVersion = rancherMinVersion;
    }
    
    public String getRancherVersion() {
        return this.rancherVersion;
    }

    public void setRancherVersion(String rancherVersion) {
      this.rancherVersion = rancherVersion;
    }
    
    public String getReadme() {
        return this.readme;
    }

    public void setReadme(String readme) {
      this.readme = readme;
    }
    
    public String getRequiredNamespace() {
        return this.requiredNamespace;
    }

    public void setRequiredNamespace(String requiredNamespace) {
      this.requiredNamespace = requiredNamespace;
    }
    
    public Map<String, Object> getUpgradeVersionLinks() {
        return this.upgradeVersionLinks;
    }

    public void setUpgradeVersionLinks(Map<String, Object> upgradeVersionLinks) {
      this.upgradeVersionLinks = upgradeVersionLinks;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
    public String getVersionDir() {
        return this.versionDir;
    }

    public void setVersionDir(String versionDir) {
      this.versionDir = versionDir;
    }
    
    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String versionName) {
      this.versionName = versionName;
    }
    
    public List<String> getVersionUrls() {
        return this.versionUrls;
    }

    public void setVersionUrls(List<String> versionUrls) {
      this.versionUrls = versionUrls;
    }
    
}
