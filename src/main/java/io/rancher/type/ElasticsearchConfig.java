package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ElasticsearchConfig extends AbstractType {

    @JsonProperty("authPassword")
    private String authPassword;

    @JsonProperty("authUsername")
    private String authUsername;

    @JsonProperty("certificate")
    private String certificate;

    @JsonProperty("clientCert")
    private String clientCert;

    @JsonProperty("clientKey")
    private String clientKey;

    @JsonProperty("clientKeyPass")
    private String clientKeyPass;

    /**
     * required true
     */
    @JsonProperty("dateFormat")
    private String dateFormat;

    /**
     * required true
     */
    @JsonProperty("endpoint")
    private String endpoint;

    /**
     * required true
     */
    @JsonProperty("indexPrefix")
    private String indexPrefix;

    @JsonProperty("sslVerify")
    private Boolean sslVerify;

    @JsonProperty("sslVersion")
    private String sslVersion;
}
