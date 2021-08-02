package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AuthzConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AuthzConfigService {

    @GET("authzConfig")
    Call<TypeCollection<AuthzConfig>> list();

    @GET("authzConfig")
    Call<TypeCollection<AuthzConfig>> list(@QueryMap Filters filters);

    @GET("authzConfig/{id}")
    Call<AuthzConfig> get(@Path("id") String id);

    @POST("authzConfig")
    Call<AuthzConfig> create(@Body AuthzConfig authzConfig);

    @PUT("authzConfig/{id}")
    Call<AuthzConfig> update(@Path("id") String id, @Body AuthzConfig authzConfig);

    @DELETE("authzConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
