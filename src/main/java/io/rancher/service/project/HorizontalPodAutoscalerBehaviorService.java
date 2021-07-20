package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HorizontalPodAutoscalerBehavior;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HorizontalPodAutoscalerBehaviorService {

    @GET("horizontalPodAutoscalerBehavior")
    Call<TypeCollection<HorizontalPodAutoscalerBehavior>> list();

    @GET("horizontalPodAutoscalerBehavior")
    Call<TypeCollection<HorizontalPodAutoscalerBehavior>> list(@QueryMap Filters filters);

    @GET("horizontalPodAutoscalerBehavior/{id}")
    Call<HorizontalPodAutoscalerBehavior> get(@Path("id") String id);

    @POST("horizontalPodAutoscalerBehavior")
    Call<HorizontalPodAutoscalerBehavior> create(@Body HorizontalPodAutoscalerBehavior horizontalPodAutoscalerBehavior);

    @PUT("horizontalPodAutoscalerBehavior/{id}")
    Call<HorizontalPodAutoscalerBehavior> update(@Path("id") String id, @Body HorizontalPodAutoscalerBehavior horizontalPodAutoscalerBehavior);

    @DELETE("horizontalPodAutoscalerBehavior/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
