package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
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
}
