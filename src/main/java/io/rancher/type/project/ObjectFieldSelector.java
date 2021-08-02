package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ObjectFieldSelector extends AbstractType {

    @JsonProperty("apiVersion")
    private String apiVersion;

    @JsonProperty("fieldPath")
    private String fieldPath;
}
