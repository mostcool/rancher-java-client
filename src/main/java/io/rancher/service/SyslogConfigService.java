package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SyslogConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SyslogConfigService {

    @GET("syslogConfig")
    Call<TypeCollection<SyslogConfig>> list();

    @GET("syslogConfig")
    Call<TypeCollection<SyslogConfig>> list(@QueryMap Filters filters);

    @GET("syslogConfig/{id}")
    Call<SyslogConfig> get(@Path("id") String id);

    @POST("syslogConfig")
    Call<SyslogConfig> create(@Body SyslogConfig syslogConfig);

    @PUT("syslogConfig/{id}")
    Call<SyslogConfig> update(@Path("id") String id, @Body SyslogConfig syslogConfig);

    @DELETE("syslogConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
