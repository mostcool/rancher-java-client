package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RunAsGroupStrategyOptions;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RunAsGroupStrategyOptionsService {

    @GET("runAsGroupStrategyOptions")
    Call<TypeCollection<RunAsGroupStrategyOptions>> list();

    @GET("runAsGroupStrategyOptions")
    Call<TypeCollection<RunAsGroupStrategyOptions>> list(@QueryMap Filters filters);

    @GET("runAsGroupStrategyOptions/{id}")
    Call<RunAsGroupStrategyOptions> get(@Path("id") String id);

    @POST("runAsGroupStrategyOptions")
    Call<RunAsGroupStrategyOptions> create(@Body RunAsGroupStrategyOptions runAsGroupStrategyOptions);

    @PUT("runAsGroupStrategyOptions/{id}")
    Call<RunAsGroupStrategyOptions> update(@Path("id") String id, @Body RunAsGroupStrategyOptions runAsGroupStrategyOptions);

    @DELETE("runAsGroupStrategyOptions/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
