package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodReadinessGate;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodReadinessGateService {

    @GET("podReadinessGate")
    Call<TypeCollection<PodReadinessGate>> list();

    @GET("podReadinessGate")
    Call<TypeCollection<PodReadinessGate>> list(@QueryMap Filters filters);

    @GET("podReadinessGate/{id}")
    Call<PodReadinessGate> get(@Path("id") String id);

    @POST("podReadinessGate")
    Call<PodReadinessGate> create(@Body PodReadinessGate podReadinessGate);

    @PUT("podReadinessGate/{id}")
    Call<PodReadinessGate> update(@Path("id") String id, @Body PodReadinessGate podReadinessGate);

    @DELETE("podReadinessGate/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
