package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class CustomConfig extends AbstractType {

    @JsonProperty("address")
    private String address;

    @JsonProperty("dockerSocket")
    private String dockerSocket;

    @JsonProperty("internalAddress")
    private String internalAddress;

    @JsonProperty("label")
    private Map<String, Object> label;

    @JsonProperty("sshCert")
    private String sshCert;

    @JsonProperty("sshKey")
    private String sshKey;

    @JsonProperty("taints")
    private List<String> taints;

    @JsonProperty("user")
    private String user;
}
