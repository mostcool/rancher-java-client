package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.HpaScalingRules;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface HpaScalingRulesService {

    @GET("hpaScalingRules")
    Call<TypeCollection<HpaScalingRules>> list();

    @GET("hpaScalingRules")
    Call<TypeCollection<HpaScalingRules>> list(@QueryMap Filters filters);

    @GET("hpaScalingRules/{id}")
    Call<HpaScalingRules> get(@Path("id") String id);

    @POST("hpaScalingRules")
    Call<HpaScalingRules> create(@Body HpaScalingRules hpaScalingRules);

    @PUT("hpaScalingRules/{id}")
    Call<HpaScalingRules> update(@Path("id") String id, @Body HpaScalingRules hpaScalingRules);

    @DELETE("hpaScalingRules/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
