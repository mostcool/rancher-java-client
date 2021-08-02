package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LinearAutoscalerParams;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LinearAutoscalerParamsService {

    @GET("linearAutoscalerParams")
    Call<TypeCollection<LinearAutoscalerParams>> list();

    @GET("linearAutoscalerParams")
    Call<TypeCollection<LinearAutoscalerParams>> list(@QueryMap Filters filters);

    @GET("linearAutoscalerParams/{id}")
    Call<LinearAutoscalerParams> get(@Path("id") String id);

    @POST("linearAutoscalerParams")
    Call<LinearAutoscalerParams> create(@Body LinearAutoscalerParams linearAutoscalerParams);

    @PUT("linearAutoscalerParams/{id}")
    Call<LinearAutoscalerParams> update(@Path("id") String id, @Body LinearAutoscalerParams linearAutoscalerParams);

    @DELETE("linearAutoscalerParams/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
