package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Condition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface ConditionService {

    @GET("condition")
    Call<TypeCollection<Condition>> list();

    @GET("condition")
    Call<TypeCollection<Condition>> list(@QueryMap Filters filters);

    @GET("condition/{id}")
    Call<Condition> get(@Path("id") String id);

    @POST("condition")
    Call<Condition> create(@Body Condition condition);

    @PUT("condition/{id}")
    Call<Condition> update(@Path("id") String id, @Body Condition condition);

    @DELETE("condition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
