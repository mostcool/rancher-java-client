package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GithubConfigApplyInput extends AbstractType {

    @JsonProperty("code")
    private String code;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("githubConfig")
    private GithubConfig githubConfig;
}
