package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CloudProvider;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CloudProviderService {

    @GET("cloudProvider")
    Call<TypeCollection<CloudProvider>> list();

    @GET("cloudProvider")
    Call<TypeCollection<CloudProvider>> list(@QueryMap Filters filters);

    @GET("cloudProvider/{id}")
    Call<CloudProvider> get(@Path("id") String id);

    @POST("cloudProvider")
    Call<CloudProvider> create(@Body CloudProvider cloudProvider);

    @PUT("cloudProvider/{id}")
    Call<CloudProvider> update(@Path("id") String id, @Body CloudProvider cloudProvider);

    @DELETE("cloudProvider/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
