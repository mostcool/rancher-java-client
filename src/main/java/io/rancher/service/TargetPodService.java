package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetPod;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TargetPodService {

    @GET("targetPod")
    Call<TypeCollection<TargetPod>> list();

    @GET("targetPod")
    Call<TypeCollection<TargetPod>> list(@QueryMap Filters filters);

    @GET("targetPod/{id}")
    Call<TargetPod> get(@Path("id") String id);

    @POST("targetPod")
    Call<TargetPod> create(@Body TargetPod targetPod);

    @PUT("targetPod/{id}")
    Call<TargetPod> update(@Path("id") String id, @Body TargetPod targetPod);

    @DELETE("targetPod/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
