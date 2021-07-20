package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AppCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface AppConditionService {

    @GET("appCondition")
    Call<TypeCollection<AppCondition>> list();

    @GET("appCondition")
    Call<TypeCollection<AppCondition>> list(@QueryMap Filters filters);

    @GET("appCondition/{id}")
    Call<AppCondition> get(@Path("id") String id);

    @POST("appCondition")
    Call<AppCondition> create(@Body AppCondition appCondition);

    @PUT("appCondition/{id}")
    Call<AppCondition> update(@Path("id") String id, @Body AppCondition appCondition);

    @DELETE("appCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
