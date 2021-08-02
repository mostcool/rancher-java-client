package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PublishCatalogConfig extends AbstractType {

    @JsonProperty("catalogTemplate")
    private String catalogTemplate;

    @JsonProperty("gitAuthor")
    private String gitAuthor;

    @JsonProperty("gitBranch")
    private String gitBranch;

    @JsonProperty("gitEmail")
    private String gitEmail;

    @JsonProperty("gitUrl")
    private String gitUrl;

    @JsonProperty("path")
    private String path;

    @JsonProperty("version")
    private String version;
}
