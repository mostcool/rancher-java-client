package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterSpecBase;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterSpecBaseService {

    @GET("clusterSpecBase")
    Call<TypeCollection<ClusterSpecBase>> list();

    @GET("clusterSpecBase")
    Call<TypeCollection<ClusterSpecBase>> list(@QueryMap Filters filters);

    @GET("clusterSpecBase/{id}")
    Call<ClusterSpecBase> get(@Path("id") String id);

    @POST("clusterSpecBase")
    Call<ClusterSpecBase> create(@Body ClusterSpecBase clusterSpecBase);

    @PUT("clusterSpecBase/{id}")
    Call<ClusterSpecBase> update(@Path("id") String id, @Body ClusterSpecBase clusterSpecBase);

    @DELETE("clusterSpecBase/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
