package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodePoolStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodePoolStatusService {

    @GET("nodePoolStatus")
    Call<TypeCollection<NodePoolStatus>> list();

    @GET("nodePoolStatus")
    Call<TypeCollection<NodePoolStatus>> list(@QueryMap Filters filters);

    @GET("nodePoolStatus/{id}")
    Call<NodePoolStatus> get(@Path("id") String id);

    @POST("nodePoolStatus")
    Call<NodePoolStatus> create(@Body NodePoolStatus nodePoolStatus);

    @PUT("nodePoolStatus/{id}")
    Call<NodePoolStatus> update(@Path("id") String id, @Body NodePoolStatus nodePoolStatus);

    @DELETE("nodePoolStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
