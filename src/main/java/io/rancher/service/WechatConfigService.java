package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.WechatConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface WechatConfigService {

    @GET("wechatConfig")
    Call<TypeCollection<WechatConfig>> list();

    @GET("wechatConfig")
    Call<TypeCollection<WechatConfig>> list(@QueryMap Filters filters);

    @GET("wechatConfig/{id}")
    Call<WechatConfig> get(@Path("id") String id);

    @POST("wechatConfig")
    Call<WechatConfig> create(@Body WechatConfig wechatConfig);

    @PUT("wechatConfig/{id}")
    Call<WechatConfig> update(@Path("id") String id, @Body WechatConfig wechatConfig);

    @DELETE("wechatConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
