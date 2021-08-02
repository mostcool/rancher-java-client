package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.NodeUpgradeStrategy;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface NodeUpgradeStrategyService {

    @GET("nodeUpgradeStrategy")
    Call<TypeCollection<NodeUpgradeStrategy>> list();

    @GET("nodeUpgradeStrategy")
    Call<TypeCollection<NodeUpgradeStrategy>> list(@QueryMap Filters filters);

    @GET("nodeUpgradeStrategy/{id}")
    Call<NodeUpgradeStrategy> get(@Path("id") String id);

    @POST("nodeUpgradeStrategy")
    Call<NodeUpgradeStrategy> create(@Body NodeUpgradeStrategy nodeUpgradeStrategy);

    @PUT("nodeUpgradeStrategy/{id}")
    Call<NodeUpgradeStrategy> update(@Path("id") String id, @Body NodeUpgradeStrategy nodeUpgradeStrategy);

    @DELETE("nodeUpgradeStrategy/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
