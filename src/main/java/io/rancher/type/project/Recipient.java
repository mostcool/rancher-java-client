package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Recipient extends AbstractType {

    @JsonProperty("notifier")
    private String notifier;

    @JsonProperty("recipient")
    private String recipient;
}
