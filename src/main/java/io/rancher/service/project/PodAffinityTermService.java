package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodAffinityTerm;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodAffinityTermService {

    @GET("podAffinityTerm")
    Call<TypeCollection<PodAffinityTerm>> list();

    @GET("podAffinityTerm")
    Call<TypeCollection<PodAffinityTerm>> list(@QueryMap Filters filters);

    @GET("podAffinityTerm/{id}")
    Call<PodAffinityTerm> get(@Path("id") String id);

    @POST("podAffinityTerm")
    Call<PodAffinityTerm> create(@Body PodAffinityTerm podAffinityTerm);

    @PUT("podAffinityTerm/{id}")
    Call<PodAffinityTerm> update(@Path("id") String id, @Body PodAffinityTerm podAffinityTerm);

    @DELETE("podAffinityTerm/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
