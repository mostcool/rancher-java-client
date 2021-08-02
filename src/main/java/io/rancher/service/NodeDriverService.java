package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeDriver;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeDriverService {

    @GET("nodeDriver")
    Call<TypeCollection<NodeDriver>> list();

    @GET("nodeDriver")
    Call<TypeCollection<NodeDriver>> list(@QueryMap Filters filters);

    @GET("nodeDriver/{id}")
    Call<NodeDriver> get(@Path("id") String id);

    @POST("nodeDriver")
    Call<NodeDriver> create(@Body NodeDriver nodeDriver);

    @PUT("nodeDriver/{id}")
    Call<NodeDriver> update(@Path("id") String id, @Body NodeDriver nodeDriver);

    @DELETE("nodeDriver/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("nodeDriver/{id}?action=activate")
    Call<NodeDriver> activate(@Path("id") String id);

    @POST("nodeDriver/{id}?action=deactivate")
    Call<NodeDriver> deactivate(@Path("id") String id);
}
