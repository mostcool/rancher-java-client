package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PublishImageConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("buildContext")
    private String buildContext;

    /**
     * required true
     */
    @JsonProperty("dockerfilePath")
    private String dockerfilePath;

    @JsonProperty("pushRemote")
    private Boolean pushRemote;

    @JsonProperty("registry")
    private String registry;

    /**
     * required true
     */
    @JsonProperty("tag")
    private String tag;
}
