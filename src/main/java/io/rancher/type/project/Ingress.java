package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Ingress extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("defaultBackend")
    private IngressBackend defaultBackend;

    @JsonProperty("description")
    private String description;

    @JsonProperty("ingressClassName")
    private String ingressClassName;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    /**
     * required true
     */
    @JsonProperty("namespaceId")
    private String namespaceId;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("projectId")
    private String projectId;

    @JsonProperty("publicEndpoints")
    private List<PublicEndpoint> publicEndpoints;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("rules")
    private List<IngressRule> rules;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private IngressStatus status;

    @JsonProperty("tls")
    private List<IngressTLS> tls;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;
}
