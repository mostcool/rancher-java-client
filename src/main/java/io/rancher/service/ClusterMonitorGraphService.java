package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterMonitorGraph;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterMonitorGraphService {

    @GET("clusterMonitorGraph")
    Call<TypeCollection<ClusterMonitorGraph>> list();

    @GET("clusterMonitorGraph")
    Call<TypeCollection<ClusterMonitorGraph>> list(@QueryMap Filters filters);

    @GET("clusterMonitorGraph/{id}")
    Call<ClusterMonitorGraph> get(@Path("id") String id);

    @POST("clusterMonitorGraph")
    Call<ClusterMonitorGraph> create(@Body ClusterMonitorGraph clusterMonitorGraph);

    @PUT("clusterMonitorGraph/{id}")
    Call<ClusterMonitorGraph> update(@Path("id") String id, @Body ClusterMonitorGraph clusterMonitorGraph);

    @DELETE("clusterMonitorGraph/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
