package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.TrafficPolicy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TrafficPolicyService {

    @GET("trafficPolicy")
    Call<TypeCollection<TrafficPolicy>> list();

    @GET("trafficPolicy")
    Call<TypeCollection<TrafficPolicy>> list(@QueryMap Filters filters);

    @GET("trafficPolicy/{id}")
    Call<TrafficPolicy> get(@Path("id") String id);

    @POST("trafficPolicy")
    Call<TrafficPolicy> create(@Body TrafficPolicy trafficPolicy);

    @PUT("trafficPolicy/{id}")
    Call<TrafficPolicy> update(@Path("id") String id, @Body TrafficPolicy trafficPolicy);

    @DELETE("trafficPolicy/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
