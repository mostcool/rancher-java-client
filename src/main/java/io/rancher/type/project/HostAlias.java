package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class HostAlias extends AbstractType {

    @JsonProperty("hostnames")
    private List<String> hostnames;

    @JsonProperty("ip")
    private String ip;
}
