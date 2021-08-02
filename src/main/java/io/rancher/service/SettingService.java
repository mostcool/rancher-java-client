package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.Setting;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SettingService {

    @GET("setting")
    Call<TypeCollection<Setting>> list();

    @GET("setting")
    Call<TypeCollection<Setting>> list(@QueryMap Filters filters);

    @GET("setting/{id}")
    Call<Setting> get(@Path("id") String id);

    @POST("setting")
    Call<Setting> create(@Body Setting setting);

    @PUT("setting/{id}")
    Call<Setting> update(@Path("id") String id, @Body Setting setting);

    @DELETE("setting/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
