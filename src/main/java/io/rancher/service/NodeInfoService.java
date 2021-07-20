package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeInfo;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface NodeInfoService {

    @GET("nodeInfo")
    Call<TypeCollection<NodeInfo>> list();

    @GET("nodeInfo")
    Call<TypeCollection<NodeInfo>> list(@QueryMap Filters filters);

    @GET("nodeInfo/{id}")
    Call<NodeInfo> get(@Path("id") String id);

    @POST("nodeInfo")
    Call<NodeInfo> create(@Body NodeInfo nodeInfo);

    @PUT("nodeInfo/{id}")
    Call<NodeInfo> update(@Path("id") String id, @Body NodeInfo nodeInfo);

    @DELETE("nodeInfo/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
