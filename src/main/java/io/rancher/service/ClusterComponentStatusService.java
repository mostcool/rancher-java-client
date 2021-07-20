package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterComponentStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterComponentStatusService {

    @GET("clusterComponentStatus")
    Call<TypeCollection<ClusterComponentStatus>> list();

    @GET("clusterComponentStatus")
    Call<TypeCollection<ClusterComponentStatus>> list(@QueryMap Filters filters);

    @GET("clusterComponentStatus/{id}")
    Call<ClusterComponentStatus> get(@Path("id") String id);

    @POST("clusterComponentStatus")
    Call<ClusterComponentStatus> create(@Body ClusterComponentStatus clusterComponentStatus);

    @PUT("clusterComponentStatus/{id}")
    Call<ClusterComponentStatus> update(@Path("id") String id, @Body ClusterComponentStatus clusterComponentStatus);

    @DELETE("clusterComponentStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
