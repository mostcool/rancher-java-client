package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PipelineNotification extends AbstractType {

    @JsonProperty("condition")
    private List<String> condition;

    @JsonProperty("message")
    private String message;

    @JsonProperty("recipients")
    private List<Recipient> recipients;
}
