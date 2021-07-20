package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SlackConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
