package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SystemServiceRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface SystemServiceRuleService {

    @GET("systemServiceRule")
    Call<TypeCollection<SystemServiceRule>> list();

    @GET("systemServiceRule")
    Call<TypeCollection<SystemServiceRule>> list(@QueryMap Filters filters);

    @GET("systemServiceRule/{id}")
    Call<SystemServiceRule> get(@Path("id") String id);

    @POST("systemServiceRule")
    Call<SystemServiceRule> create(@Body SystemServiceRule systemServiceRule);

    @PUT("systemServiceRule/{id}")
    Call<SystemServiceRule> update(@Path("id") String id, @Body SystemServiceRule systemServiceRule);

    @DELETE("systemServiceRule/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
