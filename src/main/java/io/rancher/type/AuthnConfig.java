package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class AuthnConfig extends AbstractType {

    @JsonProperty("sans")
    private List<String> sans;

    @JsonProperty("strategy")
    private String strategy;

    @JsonProperty("webhook")
    private AuthWebhookConfig webhook;
}
