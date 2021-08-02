package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AzureKubernetesServiceConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AzureKubernetesServiceConfigService {

    @GET("azureKubernetesServiceConfig")
    Call<TypeCollection<AzureKubernetesServiceConfig>> list();

    @GET("azureKubernetesServiceConfig")
    Call<TypeCollection<AzureKubernetesServiceConfig>> list(@QueryMap Filters filters);

    @GET("azureKubernetesServiceConfig/{id}")
    Call<AzureKubernetesServiceConfig> get(@Path("id") String id);

    @POST("azureKubernetesServiceConfig")
    Call<AzureKubernetesServiceConfig> create(@Body AzureKubernetesServiceConfig azureKubernetesServiceConfig);

    @PUT("azureKubernetesServiceConfig/{id}")
    Call<AzureKubernetesServiceConfig> update(@Path("id") String id, @Body AzureKubernetesServiceConfig azureKubernetesServiceConfig);

    @DELETE("azureKubernetesServiceConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
