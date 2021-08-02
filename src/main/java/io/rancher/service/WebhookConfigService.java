package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.WebhookConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface WebhookConfigService {

    @GET("webhookConfig")
    Call<TypeCollection<WebhookConfig>> list();

    @GET("webhookConfig")
    Call<TypeCollection<WebhookConfig>> list(@QueryMap Filters filters);

    @GET("webhookConfig/{id}")
    Call<WebhookConfig> get(@Path("id") String id);

    @POST("webhookConfig")
    Call<WebhookConfig> create(@Body WebhookConfig webhookConfig);

    @PUT("webhookConfig/{id}")
    Call<WebhookConfig> update(@Path("id") String id, @Body WebhookConfig webhookConfig);

    @DELETE("webhookConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
