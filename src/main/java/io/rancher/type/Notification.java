package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
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
}
