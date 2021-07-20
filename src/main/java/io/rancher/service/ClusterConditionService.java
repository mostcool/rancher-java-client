package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterCondition;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterConditionService {

    @GET("clusterCondition")
    Call<TypeCollection<ClusterCondition>> list();

    @GET("clusterCondition")
    Call<TypeCollection<ClusterCondition>> list(@QueryMap Filters filters);

    @GET("clusterCondition/{id}")
    Call<ClusterCondition> get(@Path("id") String id);

    @POST("clusterCondition")
    Call<ClusterCondition> create(@Body ClusterCondition clusterCondition);

    @PUT("clusterCondition/{id}")
    Call<ClusterCondition> update(@Path("id") String id, @Body ClusterCondition clusterCondition);

    @DELETE("clusterCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
