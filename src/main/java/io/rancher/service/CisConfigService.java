package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.CisConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CisConfigService {

    @GET("cisConfig")
    Call<TypeCollection<CisConfig>> list();

    @GET("cisConfig")
    Call<TypeCollection<CisConfig>> list(@QueryMap Filters filters);

    @GET("cisConfig/{id}")
    Call<CisConfig> get(@Path("id") String id);

    @POST("cisConfig")
    Call<CisConfig> create(@Body CisConfig cisConfig);

    @PUT("cisConfig/{id}")
    Call<CisConfig> update(@Path("id") String id, @Body CisConfig cisConfig);

    @DELETE("cisConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
