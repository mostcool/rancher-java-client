package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RancherKubernetesEngineConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RancherKubernetesEngineConfigService {

    @GET("rancherKubernetesEngineConfig")
    Call<TypeCollection<RancherKubernetesEngineConfig>> list();

    @GET("rancherKubernetesEngineConfig")
    Call<TypeCollection<RancherKubernetesEngineConfig>> list(@QueryMap Filters filters);

    @GET("rancherKubernetesEngineConfig/{id}")
    Call<RancherKubernetesEngineConfig> get(@Path("id") String id);

    @POST("rancherKubernetesEngineConfig")
    Call<RancherKubernetesEngineConfig> create(@Body RancherKubernetesEngineConfig rancherKubernetesEngineConfig);

    @PUT("rancherKubernetesEngineConfig/{id}")
    Call<RancherKubernetesEngineConfig> update(@Path("id") String id, @Body RancherKubernetesEngineConfig rancherKubernetesEngineConfig);

    @DELETE("rancherKubernetesEngineConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
