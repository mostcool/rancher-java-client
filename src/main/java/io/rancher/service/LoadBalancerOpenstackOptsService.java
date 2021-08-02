package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.LoadBalancerOpenstackOpts;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LoadBalancerOpenstackOptsService {

    @GET("loadBalancerOpenstackOpts")
    Call<TypeCollection<LoadBalancerOpenstackOpts>> list();

    @GET("loadBalancerOpenstackOpts")
    Call<TypeCollection<LoadBalancerOpenstackOpts>> list(@QueryMap Filters filters);

    @GET("loadBalancerOpenstackOpts/{id}")
    Call<LoadBalancerOpenstackOpts> get(@Path("id") String id);

    @POST("loadBalancerOpenstackOpts")
    Call<LoadBalancerOpenstackOpts> create(@Body LoadBalancerOpenstackOpts loadBalancerOpenstackOpts);

    @PUT("loadBalancerOpenstackOpts/{id}")
    Call<LoadBalancerOpenstackOpts> update(@Path("id") String id, @Body LoadBalancerOpenstackOpts loadBalancerOpenstackOpts);

    @DELETE("loadBalancerOpenstackOpts/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
