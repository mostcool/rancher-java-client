package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubeControllerService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface KubeControllerServiceService {

    @GET("kubeControllerService")
    Call<TypeCollection<KubeControllerService>> list();

    @GET("kubeControllerService")
    Call<TypeCollection<KubeControllerService>> list(@QueryMap Filters filters);

    @GET("kubeControllerService/{id}")
    Call<KubeControllerService> get(@Path("id") String id);

    @POST("kubeControllerService")
    Call<KubeControllerService> create(@Body KubeControllerService kubeControllerService);

    @PUT("kubeControllerService/{id}")
    Call<KubeControllerService> update(@Path("id") String id, @Body KubeControllerService kubeControllerService);

    @DELETE("kubeControllerService/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
