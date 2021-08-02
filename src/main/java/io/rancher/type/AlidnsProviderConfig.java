package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AlidnsProviderConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("accessKey")
    private String accessKey;

    /**
     * required true
     */
    @JsonProperty("secretKey")
    private String secretKey;
}
