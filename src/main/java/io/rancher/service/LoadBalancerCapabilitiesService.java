package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerCapabilities;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LoadBalancerCapabilitiesService {

    @GET("loadBalancerCapabilities")
    Call<TypeCollection<LoadBalancerCapabilities>> list();

    @GET("loadBalancerCapabilities")
    Call<TypeCollection<LoadBalancerCapabilities>> list(@QueryMap Filters filters);

    @GET("loadBalancerCapabilities/{id}")
    Call<LoadBalancerCapabilities> get(@Path("id") String id);

    @POST("loadBalancerCapabilities")
    Call<LoadBalancerCapabilities> create(@Body LoadBalancerCapabilities loadBalancerCapabilities);

    @PUT("loadBalancerCapabilities/{id}")
    Call<LoadBalancerCapabilities> update(@Path("id") String id, @Body LoadBalancerCapabilities loadBalancerCapabilities);

    @DELETE("loadBalancerCapabilities/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
