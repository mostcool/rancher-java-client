package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HpaScalingPolicy;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HpaScalingPolicyService {

    @GET("hpaScalingPolicy")
    Call<TypeCollection<HpaScalingPolicy>> list();

    @GET("hpaScalingPolicy")
    Call<TypeCollection<HpaScalingPolicy>> list(@QueryMap Filters filters);

    @GET("hpaScalingPolicy/{id}")
    Call<HpaScalingPolicy> get(@Path("id") String id);

    @POST("hpaScalingPolicy")
    Call<HpaScalingPolicy> create(@Body HpaScalingPolicy hpaScalingPolicy);

    @PUT("hpaScalingPolicy/{id}")
    Call<HpaScalingPolicy> update(@Path("id") String id, @Body HpaScalingPolicy hpaScalingPolicy);

    @DELETE("hpaScalingPolicy/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
