package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.QueueConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface QueueConfigService {

    @GET("queueConfig")
    Call<TypeCollection<QueueConfig>> list();

    @GET("queueConfig")
    Call<TypeCollection<QueueConfig>> list(@QueryMap Filters filters);

    @GET("queueConfig/{id}")
    Call<QueueConfig> get(@Path("id") String id);

    @POST("queueConfig")
    Call<QueueConfig> create(@Body QueueConfig queueConfig);

    @PUT("queueConfig/{id}")
    Call<QueueConfig> update(@Path("id") String id, @Body QueueConfig queueConfig);

    @DELETE("queueConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
