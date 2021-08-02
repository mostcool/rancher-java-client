package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.LoadBalancerIngress;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LoadBalancerIngressService {

    @GET("loadBalancerIngress")
    Call<TypeCollection<LoadBalancerIngress>> list();

    @GET("loadBalancerIngress")
    Call<TypeCollection<LoadBalancerIngress>> list(@QueryMap Filters filters);

    @GET("loadBalancerIngress/{id}")
    Call<LoadBalancerIngress> get(@Path("id") String id);

    @POST("loadBalancerIngress")
    Call<LoadBalancerIngress> create(@Body LoadBalancerIngress loadBalancerIngress);

    @PUT("loadBalancerIngress/{id}")
    Call<LoadBalancerIngress> update(@Path("id") String id, @Body LoadBalancerIngress loadBalancerIngress);

    @DELETE("loadBalancerIngress/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
