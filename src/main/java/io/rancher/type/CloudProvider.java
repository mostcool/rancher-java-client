package io.rancher.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CloudProvider extends AbstractType {

    @JsonProperty("awsCloudProvider")
    private AwsCloudProvider awsCloudProvider;

    @JsonProperty("azureCloudProvider")
    private AzureCloudProvider azureCloudProvider;

    @JsonProperty("customCloudProvider")
    private String customCloudProvider;

    @JsonProperty("name")
    private String name;

    @JsonProperty("openstackCloudProvider")
    private OpenstackCloudProvider openstackCloudProvider;

    @JsonProperty("vsphereCloudProvider")
    private VsphereCloudProvider vsphereCloudProvider;
}
