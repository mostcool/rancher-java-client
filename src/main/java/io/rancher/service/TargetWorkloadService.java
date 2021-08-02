package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetWorkload;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TargetWorkloadService {

    @GET("targetWorkload")
    Call<TypeCollection<TargetWorkload>> list();

    @GET("targetWorkload")
    Call<TypeCollection<TargetWorkload>> list(@QueryMap Filters filters);

    @GET("targetWorkload/{id}")
    Call<TargetWorkload> get(@Path("id") String id);

    @POST("targetWorkload")
    Call<TargetWorkload> create(@Body TargetWorkload targetWorkload);

    @PUT("targetWorkload/{id}")
    Call<TargetWorkload> update(@Path("id") String id, @Body TargetWorkload targetWorkload);

    @DELETE("targetWorkload/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
