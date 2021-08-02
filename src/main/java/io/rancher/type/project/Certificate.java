package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Certificate extends AbstractType {

    @JsonProperty("algorithm")
    private String algorithm;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("certFingerprint")
    private String certFingerprint;

    @JsonProperty("certs")
    private String certs;

    @JsonProperty("cn")
    private String cn;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("description")
    private String description;

    @JsonProperty("expiresAt")
    private String expiresAt;

    @JsonProperty("issuedAt")
    private String issuedAt;

    @JsonProperty("issuer")
    private String issuer;

    @JsonProperty("key")
    private String key;

    @JsonProperty("keySize")
    private String keySize;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("serialNumber")
    private String serialNumber;

    @JsonProperty("subjectAlternativeNames")
    private List<String> subjectAlternativeNames;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("version")
    private String version;
}
