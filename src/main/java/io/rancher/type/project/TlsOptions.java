package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TlsOptions extends AbstractType {

    @JsonProperty("caCertificates")
    private String caCertificates;

    @JsonProperty("credentialName")
    private String credentialName;

    @JsonProperty("httpsRedirect")
    private Boolean httpsRedirect;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("privateKey")
    private String privateKey;

    @JsonProperty("serverCertificate")
    private String serverCertificate;

    @JsonProperty("subjectAltNames")
    private List<String> subjectAltNames;
}
