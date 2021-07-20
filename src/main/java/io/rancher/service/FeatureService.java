package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Feature;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface FeatureService {

    @GET("feature")
    Call<TypeCollection<Feature>> list();

    @GET("feature")
    Call<TypeCollection<Feature>> list(@QueryMap Filters filters);

    @GET("feature/{id}")
    Call<Feature> get(@Path("id") String id);

    @POST("feature")
    Call<Feature> create(@Body Feature feature);

    @PUT("feature/{id}")
    Call<Feature> update(@Path("id") String id, @Body Feature feature);

    @DELETE("feature/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
