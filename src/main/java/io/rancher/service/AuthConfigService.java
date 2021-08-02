package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AuthConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AuthConfigService {

    @GET("authConfig")
    Call<TypeCollection<AuthConfig>> list();

    @GET("authConfig")
    Call<TypeCollection<AuthConfig>> list(@QueryMap Filters filters);

    @GET("authConfig/{id}")
    Call<AuthConfig> get(@Path("id") String id);

    @POST("authConfig")
    Call<AuthConfig> create(@Body AuthConfig authConfig);

    @PUT("authConfig/{id}")
    Call<AuthConfig> update(@Path("id") String id, @Body AuthConfig authConfig);

    @DELETE("authConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
