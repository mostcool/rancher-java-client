package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CloudflareProviderConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CloudflareProviderConfigService {

    @GET("cloudflareProviderConfig")
    Call<TypeCollection<CloudflareProviderConfig>> list();

    @GET("cloudflareProviderConfig")
    Call<TypeCollection<CloudflareProviderConfig>> list(@QueryMap Filters filters);

    @GET("cloudflareProviderConfig/{id}")
    Call<CloudflareProviderConfig> get(@Path("id") String id);

    @POST("cloudflareProviderConfig")
    Call<CloudflareProviderConfig> create(@Body CloudflareProviderConfig cloudflareProviderConfig);

    @PUT("cloudflareProviderConfig/{id}")
    Call<CloudflareProviderConfig> update(@Path("id") String id, @Body CloudflareProviderConfig cloudflareProviderConfig);

    @DELETE("cloudflareProviderConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
