package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodePool;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NodePoolService {

    @GET("nodePool")
    Call<TypeCollection<NodePool>> list();

    @GET("nodePool")
    Call<TypeCollection<NodePool>> list(@QueryMap Filters filters);

    @GET("nodePool/{id}")
    Call<NodePool> get(@Path("id") String id);

    @POST("nodePool")
    Call<NodePool> create(@Body NodePool nodePool);

    @PUT("nodePool/{id}")
    Call<NodePool> update(@Path("id") String id, @Body NodePool nodePool);

    @DELETE("nodePool/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
