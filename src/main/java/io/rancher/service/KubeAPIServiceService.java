package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.KubeAPIService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface KubeAPIServiceService {

    @GET("kubeAPIService")
    Call<TypeCollection<KubeAPIService>> list();

    @GET("kubeAPIService")
    Call<TypeCollection<KubeAPIService>> list(@QueryMap Filters filters);

    @GET("kubeAPIService/{id}")
    Call<KubeAPIService> get(@Path("id") String id);

    @POST("kubeAPIService")
    Call<KubeAPIService> create(@Body KubeAPIService kubeAPIService);

    @PUT("kubeAPIService/{id}")
    Call<KubeAPIService> update(@Path("id") String id, @Body KubeAPIService kubeAPIService);

    @DELETE("kubeAPIService/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
