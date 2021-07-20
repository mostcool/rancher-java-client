package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterScanRule;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterScanRuleService {

    @GET("clusterScanRule")
    Call<TypeCollection<ClusterScanRule>> list();

    @GET("clusterScanRule")
    Call<TypeCollection<ClusterScanRule>> list(@QueryMap Filters filters);

    @GET("clusterScanRule/{id}")
    Call<ClusterScanRule> get(@Path("id") String id);

    @POST("clusterScanRule")
    Call<ClusterScanRule> create(@Body ClusterScanRule clusterScanRule);

    @PUT("clusterScanRule/{id}")
    Call<ClusterScanRule> update(@Path("id") String id, @Body ClusterScanRule clusterScanRule);

    @DELETE("clusterScanRule/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
