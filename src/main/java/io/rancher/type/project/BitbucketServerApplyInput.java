package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BitbucketServerApplyInput extends AbstractType {

    @JsonProperty("hostname")
    private String hostname;

    @JsonProperty("oauthToken")
    private String oauthToken;

    @JsonProperty("oauthVerifier")
    private String oauthVerifier;

    @JsonProperty("redirectUrl")
    private String redirectUrl;

    @JsonProperty("tls")
    private Boolean tls;
}
