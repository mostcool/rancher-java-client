package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GitRepoVolumeSource extends AbstractType {

    @JsonProperty("directory")
    private String directory;

    @JsonProperty("repository")
    private String repository;

    @JsonProperty("revision")
    private String revision;
}
