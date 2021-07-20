package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FeatureStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface FeatureStatusService {

    @GET("featureStatus")
    Call<TypeCollection<FeatureStatus>> list();

    @GET("featureStatus")
    Call<TypeCollection<FeatureStatus>> list(@QueryMap Filters filters);

    @GET("featureStatus/{id}")
    Call<FeatureStatus> get(@Path("id") String id);

    @POST("featureStatus")
    Call<FeatureStatus> create(@Body FeatureStatus featureStatus);

    @PUT("featureStatus/{id}")
    Call<FeatureStatus> update(@Path("id") String id, @Body FeatureStatus featureStatus);

    @DELETE("featureStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
