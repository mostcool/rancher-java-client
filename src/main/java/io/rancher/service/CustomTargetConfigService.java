package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CustomTargetConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CustomTargetConfigService {

    @GET("customTargetConfig")
    Call<TypeCollection<CustomTargetConfig>> list();

    @GET("customTargetConfig")
    Call<TypeCollection<CustomTargetConfig>> list(@QueryMap Filters filters);

    @GET("customTargetConfig/{id}")
    Call<CustomTargetConfig> get(@Path("id") String id);

    @POST("customTargetConfig")
    Call<CustomTargetConfig> create(@Body CustomTargetConfig customTargetConfig);

    @PUT("customTargetConfig/{id}")
    Call<CustomTargetConfig> update(@Path("id") String id, @Body CustomTargetConfig customTargetConfig);

    @DELETE("customTargetConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
