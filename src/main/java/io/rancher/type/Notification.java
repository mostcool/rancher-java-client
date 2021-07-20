package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class Notification extends AbstractType {
    
    @JsonProperty("dingtalkConfig")
    private DingtalkConfig dingtalkConfig;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("msteamsConfig")
    private MsTeamsConfig msteamsConfig;
    
    @JsonProperty("pagerdutyConfig")
    private PagerdutyConfig pagerdutyConfig;
    
    @JsonProperty("slackConfig")
    private SlackConfig slackConfig;
    
    @JsonProperty("smtpConfig")
    private SmtpConfig smtpConfig;
    
    @JsonProperty("webhookConfig")
    private WebhookConfig webhookConfig;
    
    @JsonProperty("wechatConfig")
    private WechatConfig wechatConfig;
    
    public DingtalkConfig getDingtalkConfig() {
        return this.dingtalkConfig;
    }

    public void setDingtalkConfig(DingtalkConfig dingtalkConfig) {
      this.dingtalkConfig = dingtalkConfig;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public MsTeamsConfig getMsteamsConfig() {
        return this.msteamsConfig;
    }

    public void setMsteamsConfig(MsTeamsConfig msteamsConfig) {
      this.msteamsConfig = msteamsConfig;
    }
    
    public PagerdutyConfig getPagerdutyConfig() {
        return this.pagerdutyConfig;
    }

    public void setPagerdutyConfig(PagerdutyConfig pagerdutyConfig) {
      this.pagerdutyConfig = pagerdutyConfig;
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
