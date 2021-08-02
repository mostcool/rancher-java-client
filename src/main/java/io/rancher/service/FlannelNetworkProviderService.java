package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FlannelNetworkProvider;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FlannelNetworkProviderService {

    @GET("flannelNetworkProvider")
    Call<TypeCollection<FlannelNetworkProvider>> list();

    @GET("flannelNetworkProvider")
    Call<TypeCollection<FlannelNetworkProvider>> list(@QueryMap Filters filters);

    @GET("flannelNetworkProvider/{id}")
    Call<FlannelNetworkProvider> get(@Path("id") String id);

    @POST("flannelNetworkProvider")
    Call<FlannelNetworkProvider> create(@Body FlannelNetworkProvider flannelNetworkProvider);

    @PUT("flannelNetworkProvider/{id}")
    Call<FlannelNetworkProvider> update(@Path("id") String id, @Body FlannelNetworkProvider flannelNetworkProvider);

    @DELETE("flannelNetworkProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
