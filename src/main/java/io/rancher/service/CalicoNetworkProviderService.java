package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CalicoNetworkProvider;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CalicoNetworkProviderService {

    @GET("calicoNetworkProvider")
    Call<TypeCollection<CalicoNetworkProvider>> list();

    @GET("calicoNetworkProvider")
    Call<TypeCollection<CalicoNetworkProvider>> list(@QueryMap Filters filters);

    @GET("calicoNetworkProvider/{id}")
    Call<CalicoNetworkProvider> get(@Path("id") String id);

    @POST("calicoNetworkProvider")
    Call<CalicoNetworkProvider> create(@Body CalicoNetworkProvider calicoNetworkProvider);

    @PUT("calicoNetworkProvider/{id}")
    Call<CalicoNetworkProvider> update(@Path("id") String id, @Body CalicoNetworkProvider calicoNetworkProvider);

    @DELETE("calicoNetworkProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
