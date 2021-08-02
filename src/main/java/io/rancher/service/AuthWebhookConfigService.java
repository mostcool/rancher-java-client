package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.AuthWebhookConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AuthWebhookConfigService {

    @GET("authWebhookConfig")
    Call<TypeCollection<AuthWebhookConfig>> list();

    @GET("authWebhookConfig")
    Call<TypeCollection<AuthWebhookConfig>> list(@QueryMap Filters filters);

    @GET("authWebhookConfig/{id}")
    Call<AuthWebhookConfig> get(@Path("id") String id);

    @POST("authWebhookConfig")
    Call<AuthWebhookConfig> create(@Body AuthWebhookConfig authWebhookConfig);

    @PUT("authWebhookConfig/{id}")
    Call<AuthWebhookConfig> update(@Path("id") String id, @Body AuthWebhookConfig authWebhookConfig);

    @DELETE("authWebhookConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
