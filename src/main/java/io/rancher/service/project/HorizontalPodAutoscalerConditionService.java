package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HorizontalPodAutoscalerCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface HorizontalPodAutoscalerConditionService {

    @GET("horizontalPodAutoscalerCondition")
    Call<TypeCollection<HorizontalPodAutoscalerCondition>> list();

    @GET("horizontalPodAutoscalerCondition")
    Call<TypeCollection<HorizontalPodAutoscalerCondition>> list(@QueryMap Filters filters);

    @GET("horizontalPodAutoscalerCondition/{id}")
    Call<HorizontalPodAutoscalerCondition> get(@Path("id") String id);

    @POST("horizontalPodAutoscalerCondition")
    Call<HorizontalPodAutoscalerCondition> create(@Body HorizontalPodAutoscalerCondition horizontalPodAutoscalerCondition);

    @PUT("horizontalPodAutoscalerCondition/{id}")
    Call<HorizontalPodAutoscalerCondition> update(@Path("id") String id, @Body HorizontalPodAutoscalerCondition horizontalPodAutoscalerCondition);

    @DELETE("horizontalPodAutoscalerCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
