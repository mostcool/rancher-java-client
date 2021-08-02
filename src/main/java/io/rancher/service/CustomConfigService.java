package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CustomConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CustomConfigService {

    @GET("customConfig")
    Call<TypeCollection<CustomConfig>> list();

    @GET("customConfig")
    Call<TypeCollection<CustomConfig>> list(@QueryMap Filters filters);

    @GET("customConfig/{id}")
    Call<CustomConfig> get(@Path("id") String id);

    @POST("customConfig")
    Call<CustomConfig> create(@Body CustomConfig customConfig);

    @PUT("customConfig/{id}")
    Call<CustomConfig> update(@Path("id") String id, @Body CustomConfig customConfig);

    @DELETE("customConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
