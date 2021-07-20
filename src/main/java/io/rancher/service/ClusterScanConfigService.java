package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterScanConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterScanConfigService {

    @GET("clusterScanConfig")
    Call<TypeCollection<ClusterScanConfig>> list();

    @GET("clusterScanConfig")
    Call<TypeCollection<ClusterScanConfig>> list(@QueryMap Filters filters);

    @GET("clusterScanConfig/{id}")
    Call<ClusterScanConfig> get(@Path("id") String id);

    @POST("clusterScanConfig")
    Call<ClusterScanConfig> create(@Body ClusterScanConfig clusterScanConfig);

    @PUT("clusterScanConfig/{id}")
    Call<ClusterScanConfig> update(@Path("id") String id, @Body ClusterScanConfig clusterScanConfig);

    @DELETE("clusterScanConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
