package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HorizontalPodAutoscaler;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HorizontalPodAutoscalerService {

    @GET("horizontalPodAutoscaler")
    Call<TypeCollection<HorizontalPodAutoscaler>> list();

    @GET("horizontalPodAutoscaler")
    Call<TypeCollection<HorizontalPodAutoscaler>> list(@QueryMap Filters filters);

    @GET("horizontalPodAutoscaler/{id}")
    Call<HorizontalPodAutoscaler> get(@Path("id") String id);

    @POST("horizontalPodAutoscaler")
    Call<HorizontalPodAutoscaler> create(@Body HorizontalPodAutoscaler horizontalPodAutoscaler);

    @PUT("horizontalPodAutoscaler/{id}")
    Call<HorizontalPodAutoscaler> update(@Path("id") String id, @Body HorizontalPodAutoscaler horizontalPodAutoscaler);

    @DELETE("horizontalPodAutoscaler/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
