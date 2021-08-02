package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Recipient extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("notifierId")
    private String notifierId;

    /**
     * required true
     */
    @JsonProperty("notifierType")
    private String notifierType;

    @JsonProperty("recipient")
    private String recipient;
}
