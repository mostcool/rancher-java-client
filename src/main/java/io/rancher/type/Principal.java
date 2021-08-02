package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class Principal extends AbstractType {

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("extraInfo")
    private Map<String, Object> extraInfo;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("loginName")
    private String loginName;

    @JsonProperty("me")
    private Boolean me;

    @JsonProperty("memberOf")
    private Boolean memberOf;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("principalType")
    private String principalType;

    @JsonProperty("profilePicture")
    private String profilePicture;

    @JsonProperty("profileURL")
    private String profileUrl;

    @JsonProperty("provider")
    private String provider;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("uuid")
    private String uuid;
}
