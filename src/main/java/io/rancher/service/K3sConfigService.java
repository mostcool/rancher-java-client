package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.K3sConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface K3sConfigService {

    @GET("k3sConfig")
    Call<TypeCollection<K3sConfig>> list();

    @GET("k3sConfig")
    Call<TypeCollection<K3sConfig>> list(@QueryMap Filters filters);

    @GET("k3sConfig/{id}")
    Call<K3sConfig> get(@Path("id") String id);

    @POST("k3sConfig")
    Call<K3sConfig> create(@Body K3sConfig k3sConfig);

    @PUT("k3sConfig/{id}")
    Call<K3sConfig> update(@Path("id") String id, @Body K3sConfig k3sConfig);

    @DELETE("k3sConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
