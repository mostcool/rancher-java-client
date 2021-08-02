package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CanalNetworkProvider;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CanalNetworkProviderService {

    @GET("canalNetworkProvider")
    Call<TypeCollection<CanalNetworkProvider>> list();

    @GET("canalNetworkProvider")
    Call<TypeCollection<CanalNetworkProvider>> list(@QueryMap Filters filters);

    @GET("canalNetworkProvider/{id}")
    Call<CanalNetworkProvider> get(@Path("id") String id);

    @POST("canalNetworkProvider")
    Call<CanalNetworkProvider> create(@Body CanalNetworkProvider canalNetworkProvider);

    @PUT("canalNetworkProvider/{id}")
    Call<CanalNetworkProvider> update(@Path("id") String id, @Body CanalNetworkProvider canalNetworkProvider);

    @DELETE("canalNetworkProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
