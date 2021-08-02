package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HttpRedirect extends AbstractType {

    @JsonProperty("authority")
    private String authority;

    @JsonProperty("uri")
    private String uri;
}
