package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
public class AwsCloudProvider extends AbstractType {

    @JsonProperty("global")
    private GlobalAwsOpts global;

    @JsonProperty("serviceOverride")
    private Map<String, Object> serviceOverride;
}
