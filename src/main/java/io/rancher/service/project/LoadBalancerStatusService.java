package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.LoadBalancerStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LoadBalancerStatusService {

    @GET("loadBalancerStatus")
    Call<TypeCollection<LoadBalancerStatus>> list();

    @GET("loadBalancerStatus")
    Call<TypeCollection<LoadBalancerStatus>> list(@QueryMap Filters filters);

    @GET("loadBalancerStatus/{id}")
    Call<LoadBalancerStatus> get(@Path("id") String id);

    @POST("loadBalancerStatus")
    Call<LoadBalancerStatus> create(@Body LoadBalancerStatus loadBalancerStatus);

    @PUT("loadBalancerStatus/{id}")
    Call<LoadBalancerStatus> update(@Path("id") String id, @Body LoadBalancerStatus loadBalancerStatus);

    @DELETE("loadBalancerStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
