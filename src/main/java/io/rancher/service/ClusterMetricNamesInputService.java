package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterMetricNamesInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterMetricNamesInputService {

    @GET("clusterMetricNamesInput")
    Call<TypeCollection<ClusterMetricNamesInput>> list();

    @GET("clusterMetricNamesInput")
    Call<TypeCollection<ClusterMetricNamesInput>> list(@QueryMap Filters filters);

    @GET("clusterMetricNamesInput/{id}")
    Call<ClusterMetricNamesInput> get(@Path("id") String id);

    @POST("clusterMetricNamesInput")
    Call<ClusterMetricNamesInput> create(@Body ClusterMetricNamesInput clusterMetricNamesInput);

    @PUT("clusterMetricNamesInput/{id}")
    Call<ClusterMetricNamesInput> update(@Path("id") String id, @Body ClusterMetricNamesInput clusterMetricNamesInput);

    @DELETE("clusterMetricNamesInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
