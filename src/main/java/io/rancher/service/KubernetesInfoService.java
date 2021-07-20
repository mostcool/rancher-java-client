package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubernetesInfo;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface KubernetesInfoService {

    @GET("kubernetesInfo")
    Call<TypeCollection<KubernetesInfo>> list();

    @GET("kubernetesInfo")
    Call<TypeCollection<KubernetesInfo>> list(@QueryMap Filters filters);

    @GET("kubernetesInfo/{id}")
    Call<KubernetesInfo> get(@Path("id") String id);

    @POST("kubernetesInfo")
    Call<KubernetesInfo> create(@Body KubernetesInfo kubernetesInfo);

    @PUT("kubernetesInfo/{id}")
    Call<KubernetesInfo> update(@Path("id") String id, @Body KubernetesInfo kubernetesInfo);

    @DELETE("kubernetesInfo/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
