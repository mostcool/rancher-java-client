package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

import java.util.List;
import java.util.Map;

public class Notifier extends AbstractType {
    
    @JsonProperty("annotations")
    private Map<String, Object> annotations;
    
    @JsonProperty("clusterId")
    private String clusterId;
    
    @JsonProperty("created")
    private String created;
    
    @JsonProperty("creatorId")
    private String creatorId;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("dingtalkConfig")
    private DingtalkConfig dingtalkConfig;
    
    @JsonProperty("labels")
    private Map<String, Object> labels;
    
    @JsonProperty("msteamsConfig")
    private MsTeamsConfig msteamsConfig;
    
    /**
     * required true
     */
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("namespaceId")
    private String namespaceId;
    
    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;
    
    @JsonProperty("pagerdutyConfig")
    private PagerdutyConfig pagerdutyConfig;
    
    @JsonProperty("removed")
    private String removed;
    
    @JsonProperty("sendResolved")
    private Boolean sendResolved;
    
    @JsonProperty("slackConfig")
    private SlackConfig slackConfig;
    
    @JsonProperty("smtpConfig")
    private SmtpConfig smtpConfig;
    
    @JsonProperty("state")
    private String state;
    
    @JsonProperty("status")
    private NotifierStatus status;
    
    @JsonProperty("transitioning")
    private String transitioning;
    
    @JsonProperty("transitioningMessage")
    private String transitioningMessage;
    
    @JsonProperty("uuid")
    private String uuid;
    
    @JsonProperty("webhookConfig")
    private WebhookConfig webhookConfig;
    
    @JsonProperty("wechatConfig")
    private WechatConfig wechatConfig;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public DingtalkConfig getDingtalkConfig() {
        return this.dingtalkConfig;
    }

    public void setDingtalkConfig(DingtalkConfig dingtalkConfig) {
      this.dingtalkConfig = dingtalkConfig;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public MsTeamsConfig getMsteamsConfig() {
        return this.msteamsConfig;
    }

    public void setMsteamsConfig(MsTeamsConfig msteamsConfig) {
      this.msteamsConfig = msteamsConfig;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public PagerdutyConfig getPagerdutyConfig() {
        return this.pagerdutyConfig;
    }

    public void setPagerdutyConfig(PagerdutyConfig pagerdutyConfig) {
      this.pagerdutyConfig = pagerdutyConfig;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Boolean getSendResolved() {
        return this.sendResolved;
    }

    public void setSendResolved(Boolean sendResolved) {
      this.sendResolved = sendResolved;
    }
    
    public SlackConfig getSlackConfig() {
        return this.slackConfig;
    }

    public void setSlackConfig(SlackConfig slackConfig) {
      this.slackConfig = slackConfig;
    }
    
    public SmtpConfig getSmtpConfig() {
        return this.smtpConfig;
    }

    public void setSmtpConfig(SmtpConfig smtpConfig) {
      this.smtpConfig = smtpConfig;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public NotifierStatus getStatus() {
        return this.status;
    }

    public void setStatus(NotifierStatus status) {
      this.status = status;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public WebhookConfig getWebhookConfig() {
        return this.webhookConfig;
    }

    public void setWebhookConfig(WebhookConfig webhookConfig) {
      this.webhookConfig = webhookConfig;
    }
    
    public WechatConfig getWechatConfig() {
        return this.wechatConfig;
    }

    public void setWechatConfig(WechatConfig wechatConfig) {
      this.wechatConfig = wechatConfig;
    }
    
}
