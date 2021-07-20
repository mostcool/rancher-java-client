package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AlidnsProviderConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AlidnsProviderConfigService {

    @GET("alidnsProviderConfig")
    Call<TypeCollection<AlidnsProviderConfig>> list();

    @GET("alidnsProviderConfig")
    Call<TypeCollection<AlidnsProviderConfig>> list(@QueryMap Filters filters);

    @GET("alidnsProviderConfig/{id}")
    Call<AlidnsProviderConfig> get(@Path("id") String id);

    @POST("alidnsProviderConfig")
    Call<AlidnsProviderConfig> create(@Body AlidnsProviderConfig alidnsProviderConfig);

    @PUT("alidnsProviderConfig/{id}")
    Call<AlidnsProviderConfig> update(@Path("id") String id, @Body AlidnsProviderConfig alidnsProviderConfig);

    @DELETE("alidnsProviderConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
