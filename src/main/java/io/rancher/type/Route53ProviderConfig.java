package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Route53ProviderConfig extends AbstractType {

    /**
     * required true
     */
    @JsonProperty("accessKey")
    private String accessKey;

    @JsonProperty("credentialsPath")
    private String credentialsPath;

    @JsonProperty("region")
    private String region;

    @JsonProperty("roleArn")
    private String roleArn;

    /**
     * required true
     */
    @JsonProperty("secretKey")
    private String secretKey;

    @JsonProperty("zoneType")
    private String zoneType;
}
