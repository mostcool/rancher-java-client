package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.DingtalkConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface DingtalkConfigService {

    @GET("dingtalkConfig")
    Call<TypeCollection<DingtalkConfig>> list();

    @GET("dingtalkConfig")
    Call<TypeCollection<DingtalkConfig>> list(@QueryMap Filters filters);

    @GET("dingtalkConfig/{id}")
    Call<DingtalkConfig> get(@Path("id") String id);

    @POST("dingtalkConfig")
    Call<DingtalkConfig> create(@Body DingtalkConfig dingtalkConfig);

    @PUT("dingtalkConfig/{id}")
    Call<DingtalkConfig> update(@Path("id") String id, @Body DingtalkConfig dingtalkConfig);

    @DELETE("dingtalkConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
