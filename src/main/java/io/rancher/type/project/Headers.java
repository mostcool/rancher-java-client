package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Headers extends AbstractType {

    @JsonProperty("request")
    private HeaderOperations request;

    @JsonProperty("response")
    private HeaderOperations response;
}
