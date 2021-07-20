package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PipelineNotification;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PipelineNotificationService {

    @GET("pipelineNotification")
    Call<TypeCollection<PipelineNotification>> list();

    @GET("pipelineNotification")
    Call<TypeCollection<PipelineNotification>> list(@QueryMap Filters filters);

    @GET("pipelineNotification/{id}")
    Call<PipelineNotification> get(@Path("id") String id);

    @POST("pipelineNotification")
    Call<PipelineNotification> create(@Body PipelineNotification pipelineNotification);

    @PUT("pipelineNotification/{id}")
    Call<PipelineNotification> update(@Path("id") String id, @Body PipelineNotification pipelineNotification);

    @DELETE("pipelineNotification/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
