package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterLoggingSpec;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterLoggingSpecService {

    @GET("clusterLoggingSpec")
    Call<TypeCollection<ClusterLoggingSpec>> list();

    @GET("clusterLoggingSpec")
    Call<TypeCollection<ClusterLoggingSpec>> list(@QueryMap Filters filters);

    @GET("clusterLoggingSpec/{id}")
    Call<ClusterLoggingSpec> get(@Path("id") String id);

    @POST("clusterLoggingSpec")
    Call<ClusterLoggingSpec> create(@Body ClusterLoggingSpec clusterLoggingSpec);

    @PUT("clusterLoggingSpec/{id}")
    Call<ClusterLoggingSpec> update(@Path("id") String id, @Body ClusterLoggingSpec clusterLoggingSpec);

    @DELETE("clusterLoggingSpec/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
