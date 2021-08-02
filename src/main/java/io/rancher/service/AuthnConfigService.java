package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AuthnConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AuthnConfigService {

    @GET("authnConfig")
    Call<TypeCollection<AuthnConfig>> list();

    @GET("authnConfig")
    Call<TypeCollection<AuthnConfig>> list(@QueryMap Filters filters);

    @GET("authnConfig/{id}")
    Call<AuthnConfig> get(@Path("id") String id);

    @POST("authnConfig")
    Call<AuthnConfig> create(@Body AuthnConfig authnConfig);

    @PUT("authnConfig/{id}")
    Call<AuthnConfig> update(@Path("id") String id, @Body AuthnConfig authnConfig);

    @DELETE("authnConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
