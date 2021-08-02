package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GithubApplyInput extends AbstractType {

    @JsonProperty("clientId")
    private String clientId;

    @JsonProperty("clientSecret")
    private String clientSecret;

    @JsonProperty("code")
    private String code;

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("inheritAuth")
    private Boolean inheritAuth;

    @JsonProperty("redirectUrl")
    private String redirectUrl;

    @JsonProperty("tls")
    private Boolean tls;
}
