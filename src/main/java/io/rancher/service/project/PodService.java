package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Pod;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodService {

    @GET("pod")
    Call<TypeCollection<Pod>> list();

    @GET("pod")
    Call<TypeCollection<Pod>> list(@QueryMap Filters filters);

    @GET("pod/{id}")
    Call<Pod> get(@Path("id") String id);

    @POST("pod")
    Call<Pod> create(@Body Pod pod);

    @PUT("pod/{id}")
    Call<Pod> update(@Path("id") String id, @Body Pod pod);

    @DELETE("pod/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
