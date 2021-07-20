package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PodStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface PodStatusService {

    @GET("podStatus")
    Call<TypeCollection<PodStatus>> list();

    @GET("podStatus")
    Call<TypeCollection<PodStatus>> list(@QueryMap Filters filters);

    @GET("podStatus/{id}")
    Call<PodStatus> get(@Path("id") String id);

    @POST("podStatus")
    Call<PodStatus> create(@Body PodStatus podStatus);

    @PUT("podStatus/{id}")
    Call<PodStatus> update(@Path("id") String id, @Body PodStatus podStatus);

    @DELETE("podStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
