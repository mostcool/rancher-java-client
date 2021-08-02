package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.EventRateLimit;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface EventRateLimitService {

    @GET("eventRateLimit")
    Call<TypeCollection<EventRateLimit>> list();

    @GET("eventRateLimit")
    Call<TypeCollection<EventRateLimit>> list(@QueryMap Filters filters);

    @GET("eventRateLimit/{id}")
    Call<EventRateLimit> get(@Path("id") String id);

    @POST("eventRateLimit")
    Call<EventRateLimit> create(@Body EventRateLimit eventRateLimit);

    @PUT("eventRateLimit/{id}")
    Call<EventRateLimit> update(@Path("id") String id, @Body EventRateLimit eventRateLimit);

    @DELETE("eventRateLimit/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
