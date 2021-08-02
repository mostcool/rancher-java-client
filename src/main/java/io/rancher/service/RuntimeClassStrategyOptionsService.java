package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RuntimeClassStrategyOptions;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RuntimeClassStrategyOptionsService {

    @GET("runtimeClassStrategyOptions")
    Call<TypeCollection<RuntimeClassStrategyOptions>> list();

    @GET("runtimeClassStrategyOptions")
    Call<TypeCollection<RuntimeClassStrategyOptions>> list(@QueryMap Filters filters);

    @GET("runtimeClassStrategyOptions/{id}")
    Call<RuntimeClassStrategyOptions> get(@Path("id") String id);

    @POST("runtimeClassStrategyOptions")
    Call<RuntimeClassStrategyOptions> create(@Body RuntimeClassStrategyOptions runtimeClassStrategyOptions);

    @PUT("runtimeClassStrategyOptions/{id}")
    Call<RuntimeClassStrategyOptions> update(@Path("id") String id, @Body RuntimeClassStrategyOptions runtimeClassStrategyOptions);

    @DELETE("runtimeClassStrategyOptions/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
