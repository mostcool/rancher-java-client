package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.RestoreConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RestoreConfigService {

    @GET("restoreConfig")
    Call<TypeCollection<RestoreConfig>> list();

    @GET("restoreConfig")
    Call<TypeCollection<RestoreConfig>> list(@QueryMap Filters filters);

    @GET("restoreConfig/{id}")
    Call<RestoreConfig> get(@Path("id") String id);

    @POST("restoreConfig")
    Call<RestoreConfig> create(@Body RestoreConfig restoreConfig);

    @PUT("restoreConfig/{id}")
    Call<RestoreConfig> update(@Path("id") String id, @Body RestoreConfig restoreConfig);

    @DELETE("restoreConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
