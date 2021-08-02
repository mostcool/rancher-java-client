package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class TlsSettings extends AbstractType {

    @JsonProperty("caCertificates")
    private String caCertificates;

    @JsonProperty("clientCertificate")
    private String clientCertificate;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("privateKey")
    private String privateKey;

    @JsonProperty("sni")
    private String sni;

    @JsonProperty("subjectAltNames")
    private List<String> subjectAltNames;
}
