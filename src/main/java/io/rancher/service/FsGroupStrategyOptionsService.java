package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.FsGroupStrategyOptions;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface FsGroupStrategyOptionsService {

    @GET("fsGroupStrategyOptions")
    Call<TypeCollection<FsGroupStrategyOptions>> list();

    @GET("fsGroupStrategyOptions")
    Call<TypeCollection<FsGroupStrategyOptions>> list(@QueryMap Filters filters);

    @GET("fsGroupStrategyOptions/{id}")
    Call<FsGroupStrategyOptions> get(@Path("id") String id);

    @POST("fsGroupStrategyOptions")
    Call<FsGroupStrategyOptions> create(@Body FsGroupStrategyOptions fsGroupStrategyOptions);

    @PUT("fsGroupStrategyOptions/{id}")
    Call<FsGroupStrategyOptions> update(@Path("id") String id, @Body FsGroupStrategyOptions fsGroupStrategyOptions);

    @DELETE("fsGroupStrategyOptions/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
