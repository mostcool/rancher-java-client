package io.rancher.type;

import io.rancher.base.AbstractType;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    
    public AwsCloudProvider getAwsCloudProvider() {
        return this.awsCloudProvider;
    }

    public void setAwsCloudProvider(AwsCloudProvider awsCloudProvider) {
      this.awsCloudProvider = awsCloudProvider;
    }
    
    public AzureCloudProvider getAzureCloudProvider() {
        return this.azureCloudProvider;
    }

    public void setAzureCloudProvider(AzureCloudProvider azureCloudProvider) {
      this.azureCloudProvider = azureCloudProvider;
    }
    
    public String getCustomCloudProvider() {
        return this.customCloudProvider;
    }

    public void setCustomCloudProvider(String customCloudProvider) {
      this.customCloudProvider = customCloudProvider;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public OpenstackCloudProvider getOpenstackCloudProvider() {
        return this.openstackCloudProvider;
    }

    public void setOpenstackCloudProvider(OpenstackCloudProvider openstackCloudProvider) {
      this.openstackCloudProvider = openstackCloudProvider;
    }
    
    public VsphereCloudProvider getVsphereCloudProvider() {
        return this.vsphereCloudProvider;
    }

    public void setVsphereCloudProvider(VsphereCloudProvider vsphereCloudProvider) {
      this.vsphereCloudProvider = vsphereCloudProvider;
    }
    
}
