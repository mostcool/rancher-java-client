package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CatalogCondition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface CatalogConditionService {

    @GET("catalogCondition")
    Call<TypeCollection<CatalogCondition>> list();

    @GET("catalogCondition")
    Call<TypeCollection<CatalogCondition>> list(@QueryMap Filters filters);

    @GET("catalogCondition/{id}")
    Call<CatalogCondition> get(@Path("id") String id);

    @POST("catalogCondition")
    Call<CatalogCondition> create(@Body CatalogCondition catalogCondition);

    @PUT("catalogCondition/{id}")
    Call<CatalogCondition> update(@Path("id") String id, @Body CatalogCondition catalogCondition);

    @DELETE("catalogCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
