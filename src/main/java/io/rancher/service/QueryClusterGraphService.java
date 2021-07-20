package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.QueryClusterGraph;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface QueryClusterGraphService {

    @GET("queryClusterGraph")
    Call<TypeCollection<QueryClusterGraph>> list();

    @GET("queryClusterGraph")
    Call<TypeCollection<QueryClusterGraph>> list(@QueryMap Filters filters);

    @GET("queryClusterGraph/{id}")
    Call<QueryClusterGraph> get(@Path("id") String id);

    @POST("queryClusterGraph")
    Call<QueryClusterGraph> create(@Body QueryClusterGraph queryClusterGraph);

    @PUT("queryClusterGraph/{id}")
    Call<QueryClusterGraph> update(@Path("id") String id, @Body QueryClusterGraph queryClusterGraph);

    @DELETE("queryClusterGraph/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
