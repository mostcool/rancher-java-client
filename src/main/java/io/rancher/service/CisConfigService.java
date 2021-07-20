package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CisConfigService {

    @GET("cisConfig")
    Call<TypeCollection<CisConfig>> list();

    @GET("cisConfig")
    Call<TypeCollection<CisConfig>> list(@QueryMap Filters filters);

    @GET("cisConfig/{id}")
    Call<CisConfig> get(@Path("id") String id);

    @POST("cisConfig")
    Call<CisConfig> create(@Body CisConfig cisConfig);

    @PUT("cisConfig/{id}")
    Call<CisConfig> update(@Path("id") String id, @Body CisConfig cisConfig);

    @DELETE("cisConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
