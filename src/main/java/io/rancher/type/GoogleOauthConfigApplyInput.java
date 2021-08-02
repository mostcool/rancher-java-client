package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GoogleOauthConfigApplyInput extends AbstractType {

    @JsonProperty("code")
    private String code;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("googleOauthConfig")
    private GoogleOauthConfig googleOauthConfig;
}
