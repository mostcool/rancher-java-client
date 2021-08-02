package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AzureCloudProvider;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AzureCloudProviderService {

    @GET("azureCloudProvider")
    Call<TypeCollection<AzureCloudProvider>> list();

    @GET("azureCloudProvider")
    Call<TypeCollection<AzureCloudProvider>> list(@QueryMap Filters filters);

    @GET("azureCloudProvider/{id}")
    Call<AzureCloudProvider> get(@Path("id") String id);

    @POST("azureCloudProvider")
    Call<AzureCloudProvider> create(@Body AzureCloudProvider azureCloudProvider);

    @PUT("azureCloudProvider/{id}")
    Call<AzureCloudProvider> update(@Path("id") String id, @Body AzureCloudProvider azureCloudProvider);

    @DELETE("azureCloudProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
