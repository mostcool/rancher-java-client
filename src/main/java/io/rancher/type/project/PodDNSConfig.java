package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class PodDNSConfig extends AbstractType {

    @JsonProperty("nameservers")
    private List<String> nameservers;

    @JsonProperty("options")
    private List<PodDNSConfigOption> options;

    @JsonProperty("searches")
    private List<String> searches;
}
