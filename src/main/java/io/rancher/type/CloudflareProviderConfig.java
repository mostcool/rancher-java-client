package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CloudflareProviderConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("apiEmail")
    private String apiEmail;

    /**
     * required true
     */
    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("proxySetting")
    private Boolean proxySetting;
}
