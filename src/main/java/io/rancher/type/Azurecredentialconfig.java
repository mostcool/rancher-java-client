package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Azurecredentialconfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("clientId")
    private String clientId;

    /**
     * required true
     */
    @JsonProperty("clientSecret")
    private String clientSecret;

    /**
     * required true
     */
    @JsonProperty("subscriptionId")
    private String subscriptionId;
}
