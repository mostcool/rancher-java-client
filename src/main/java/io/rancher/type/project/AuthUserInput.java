package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AuthUserInput extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("code")
    private String code;

    @JsonProperty("redirectUrl")
    private String redirectUrl;

    /**
     * required true
     */
    @JsonProperty("sourceCodeType")
    private String sourceCodeType;
}
