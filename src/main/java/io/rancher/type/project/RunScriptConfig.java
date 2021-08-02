package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RunScriptConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("image")
    private String image;

    @JsonProperty("shellScript")
    private String shellScript;
}
