package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.TargetNode;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TargetNodeService {

    @GET("targetNode")
    Call<TypeCollection<TargetNode>> list();

    @GET("targetNode")
    Call<TypeCollection<TargetNode>> list(@QueryMap Filters filters);

    @GET("targetNode/{id}")
    Call<TargetNode> get(@Path("id") String id);

    @POST("targetNode")
    Call<TargetNode> create(@Body TargetNode targetNode);

    @PUT("targetNode/{id}")
    Call<TargetNode> update(@Path("id") String id, @Body TargetNode targetNode);

    @DELETE("targetNode/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
