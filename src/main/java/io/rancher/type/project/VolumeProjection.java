package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class VolumeProjection extends AbstractType {

    @JsonProperty("configMap")
    private ConfigMapProjection configMap;

    @JsonProperty("downwardAPI")
    private DownwardAPIProjection downwardApi;

    @JsonProperty("secret")
    private SecretProjection secret;

    @JsonProperty("serviceAccountToken")
    private ServiceAccountTokenProjection serviceAccountToken;
}
