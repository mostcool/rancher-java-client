package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterScan;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterScanService {

    @GET("clusterScan")
    Call<TypeCollection<ClusterScan>> list();

    @GET("clusterScan")
    Call<TypeCollection<ClusterScan>> list(@QueryMap Filters filters);

    @GET("clusterScan/{id}")
    Call<ClusterScan> get(@Path("id") String id);

    @POST("clusterScan")
    Call<ClusterScan> create(@Body ClusterScan clusterScan);

    @PUT("clusterScan/{id}")
    Call<ClusterScan> update(@Path("id") String id, @Body ClusterScan clusterScan);

    @DELETE("clusterScan/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
