package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.K3sUpgradeStrategy;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface K3sUpgradeStrategyService {

    @GET("k3sUpgradeStrategy")
    Call<TypeCollection<K3sUpgradeStrategy>> list();

    @GET("k3sUpgradeStrategy")
    Call<TypeCollection<K3sUpgradeStrategy>> list(@QueryMap Filters filters);

    @GET("k3sUpgradeStrategy/{id}")
    Call<K3sUpgradeStrategy> get(@Path("id") String id);

    @POST("k3sUpgradeStrategy")
    Call<K3sUpgradeStrategy> create(@Body K3sUpgradeStrategy k3sUpgradeStrategy);

    @PUT("k3sUpgradeStrategy/{id}")
    Call<K3sUpgradeStrategy> update(@Path("id") String id, @Body K3sUpgradeStrategy k3sUpgradeStrategy);

    @DELETE("k3sUpgradeStrategy/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
