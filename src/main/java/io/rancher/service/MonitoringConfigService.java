package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MonitoringConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MonitoringConfigService {

    @GET("monitoringConfig")
    Call<TypeCollection<MonitoringConfig>> list();

    @GET("monitoringConfig")
    Call<TypeCollection<MonitoringConfig>> list(@QueryMap Filters filters);

    @GET("monitoringConfig/{id}")
    Call<MonitoringConfig> get(@Path("id") String id);

    @POST("monitoringConfig")
    Call<MonitoringConfig> create(@Body MonitoringConfig monitoringConfig);

    @PUT("monitoringConfig/{id}")
    Call<MonitoringConfig> update(@Path("id") String id, @Body MonitoringConfig monitoringConfig);

    @DELETE("monitoringConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
