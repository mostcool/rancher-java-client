package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CalicoNetworkProvider;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
