package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.WeaveNetworkProvider;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface WeaveNetworkProviderService {

    @GET("weaveNetworkProvider")
    Call<TypeCollection<WeaveNetworkProvider>> list();

    @GET("weaveNetworkProvider")
    Call<TypeCollection<WeaveNetworkProvider>> list(@QueryMap Filters filters);

    @GET("weaveNetworkProvider/{id}")
    Call<WeaveNetworkProvider> get(@Path("id") String id);

    @POST("weaveNetworkProvider")
    Call<WeaveNetworkProvider> create(@Body WeaveNetworkProvider weaveNetworkProvider);

    @PUT("weaveNetworkProvider/{id}")
    Call<WeaveNetworkProvider> update(@Path("id") String id, @Body WeaveNetworkProvider weaveNetworkProvider);

    @DELETE("weaveNetworkProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
