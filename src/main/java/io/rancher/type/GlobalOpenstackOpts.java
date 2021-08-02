package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GlobalOpenstackOpts extends AbstractType {

    @JsonProperty("auth-url")
    private String authUrl;

    @JsonProperty("ca-file")
    private String caFile;

    @JsonProperty("domain-id")
    private String domainId;

    @JsonProperty("domain-name")
    private String domainName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("region")
    private String region;

    @JsonProperty("tenant-id")
    private String tenantId;

    @JsonProperty("tenant-name")
    private String tenantName;

    @JsonProperty("trust-id")
    private String trustId;

    @JsonProperty("user-id")
    private String userId;

    @JsonProperty("username")
    private String username;
}
