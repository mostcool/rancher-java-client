package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;

public class VolumeProjection extends AbstractType {
    
    @JsonProperty("configMap")
    private ConfigMapProjection configMap;
    
    @JsonProperty("downwardAPI")
    private DownwardAPIProjection downwardApi;
    
    @JsonProperty("secret")
    private SecretProjection secret;
    
    @JsonProperty("serviceAccountToken")
    private ServiceAccountTokenProjection serviceAccountToken;
    
    public ConfigMapProjection getConfigMap() {
        return this.configMap;
    }

    public void setConfigMap(ConfigMapProjection configMap) {
      this.configMap = configMap;
    }
    
    public DownwardAPIProjection getDownwardApi() {
        return this.downwardApi;
    }

    public void setDownwardApi(DownwardAPIProjection downwardApi) {
      this.downwardApi = downwardApi;
    }
    
    public SecretProjection getSecret() {
        return this.secret;
    }

    public void setSecret(SecretProjection secret) {
      this.secret = secret;
    }
    
    public ServiceAccountTokenProjection getServiceAccountToken() {
        return this.serviceAccountToken;
    }

    public void setServiceAccountToken(ServiceAccountTokenProjection serviceAccountToken) {
      this.serviceAccountToken = serviceAccountToken;
    }
    
}
