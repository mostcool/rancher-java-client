package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeDriverStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeDriverStatusService {

    @GET("nodeDriverStatus")
    Call<TypeCollection<NodeDriverStatus>> list();

    @GET("nodeDriverStatus")
    Call<TypeCollection<NodeDriverStatus>> list(@QueryMap Filters filters);

    @GET("nodeDriverStatus/{id}")
    Call<NodeDriverStatus> get(@Path("id") String id);

    @POST("nodeDriverStatus")
    Call<NodeDriverStatus> create(@Body NodeDriverStatus nodeDriverStatus);

    @PUT("nodeDriverStatus/{id}")
    Call<NodeDriverStatus> update(@Path("id") String id, @Body NodeDriverStatus nodeDriverStatus);

    @DELETE("nodeDriverStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
