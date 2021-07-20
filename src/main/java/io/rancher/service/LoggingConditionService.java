package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoggingCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface LoggingConditionService {

    @GET("loggingCondition")
    Call<TypeCollection<LoggingCondition>> list();

    @GET("loggingCondition")
    Call<TypeCollection<LoggingCondition>> list(@QueryMap Filters filters);

    @GET("loggingCondition/{id}")
    Call<LoggingCondition> get(@Path("id") String id);

    @POST("loggingCondition")
    Call<LoggingCondition> create(@Body LoggingCondition loggingCondition);

    @PUT("loggingCondition/{id}")
    Call<LoggingCondition> update(@Path("id") String id, @Body LoggingCondition loggingCondition);

    @DELETE("loggingCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
