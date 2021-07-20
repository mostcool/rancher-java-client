package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodIP;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodIPService {

    @GET("podIP")
    Call<TypeCollection<PodIP>> list();

    @GET("podIP")
    Call<TypeCollection<PodIP>> list(@QueryMap Filters filters);

    @GET("podIP/{id}")
    Call<PodIP> get(@Path("id") String id);

    @POST("podIP")
    Call<PodIP> create(@Body PodIP podIP);

    @PUT("podIP/{id}")
    Call<PodIP> update(@Path("id") String id, @Body PodIP podIP);

    @DELETE("podIP/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
