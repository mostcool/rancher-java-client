package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.UpgradeStrategy;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface UpgradeStrategyService {

    @GET("upgradeStrategy")
    Call<TypeCollection<UpgradeStrategy>> list();

    @GET("upgradeStrategy")
    Call<TypeCollection<UpgradeStrategy>> list(@QueryMap Filters filters);

    @GET("upgradeStrategy/{id}")
    Call<UpgradeStrategy> get(@Path("id") String id);

    @POST("upgradeStrategy")
    Call<UpgradeStrategy> create(@Body UpgradeStrategy upgradeStrategy);

    @PUT("upgradeStrategy/{id}")
    Call<UpgradeStrategy> update(@Path("id") String id, @Body UpgradeStrategy upgradeStrategy);

    @DELETE("upgradeStrategy/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
