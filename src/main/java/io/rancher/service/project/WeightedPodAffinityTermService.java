package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.WeightedPodAffinityTerm;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface WeightedPodAffinityTermService {

    @GET("weightedPodAffinityTerm")
    Call<TypeCollection<WeightedPodAffinityTerm>> list();

    @GET("weightedPodAffinityTerm")
    Call<TypeCollection<WeightedPodAffinityTerm>> list(@QueryMap Filters filters);

    @GET("weightedPodAffinityTerm/{id}")
    Call<WeightedPodAffinityTerm> get(@Path("id") String id);

    @POST("weightedPodAffinityTerm")
    Call<WeightedPodAffinityTerm> create(@Body WeightedPodAffinityTerm weightedPodAffinityTerm);

    @PUT("weightedPodAffinityTerm/{id}")
    Call<WeightedPodAffinityTerm> update(@Path("id") String id, @Body WeightedPodAffinityTerm weightedPodAffinityTerm);

    @DELETE("weightedPodAffinityTerm/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
