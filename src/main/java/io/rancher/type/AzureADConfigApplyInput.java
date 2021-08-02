package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AzureADConfigApplyInput extends AbstractType {

    @JsonProperty("code")
    private String code;

    @JsonProperty("config")
    private AzureADConfig config;
}
