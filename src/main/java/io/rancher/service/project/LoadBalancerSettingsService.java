package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.LoadBalancerSettings;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface LoadBalancerSettingsService {

    @GET("loadBalancerSettings")
    Call<TypeCollection<LoadBalancerSettings>> list();

    @GET("loadBalancerSettings")
    Call<TypeCollection<LoadBalancerSettings>> list(@QueryMap Filters filters);

    @GET("loadBalancerSettings/{id}")
    Call<LoadBalancerSettings> get(@Path("id") String id);

    @POST("loadBalancerSettings")
    Call<LoadBalancerSettings> create(@Body LoadBalancerSettings loadBalancerSettings);

    @PUT("loadBalancerSettings/{id}")
    Call<LoadBalancerSettings> update(@Path("id") String id, @Body LoadBalancerSettings loadBalancerSettings);

    @DELETE("loadBalancerSettings/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
