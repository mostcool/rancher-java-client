package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SlackConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SlackConfigService {

    @GET("slackConfig")
    Call<TypeCollection<SlackConfig>> list();

    @GET("slackConfig")
    Call<TypeCollection<SlackConfig>> list(@QueryMap Filters filters);

    @GET("slackConfig/{id}")
    Call<SlackConfig> get(@Path("id") String id);

    @POST("slackConfig")
    Call<SlackConfig> create(@Body SlackConfig slackConfig);

    @PUT("slackConfig/{id}")
    Call<SlackConfig> update(@Path("id") String id, @Body SlackConfig slackConfig);

    @DELETE("slackConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
