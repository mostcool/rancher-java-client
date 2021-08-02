package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CustomTargetConfig extends AbstractType {

    @JsonProperty("certificate")
    private String certificate;

    @JsonProperty("clientCert")
    private String clientCert;

    @JsonProperty("clientKey")
    private String clientKey;

    @JsonProperty("content")
    private String content;
}
