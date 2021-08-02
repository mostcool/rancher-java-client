package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class GlobalDnsProvider extends AbstractType {

    @JsonProperty("alidnsProviderConfig")
    private AlidnsProviderConfig alidnsProviderConfig;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("cloudflareProviderConfig")
    private CloudflareProviderConfig cloudflareProviderConfig;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("members")
    private List<Member> members;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("rootDomain")
    private String rootDomain;

    @JsonProperty("route53ProviderConfig")
    private Route53ProviderConfig route53providerConfig;

    @JsonProperty("uuid")
    private String uuid;
}
