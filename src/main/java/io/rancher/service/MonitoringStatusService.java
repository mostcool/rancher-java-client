package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MonitoringStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MonitoringStatusService {

    @GET("monitoringStatus")
    Call<TypeCollection<MonitoringStatus>> list();

    @GET("monitoringStatus")
    Call<TypeCollection<MonitoringStatus>> list(@QueryMap Filters filters);

    @GET("monitoringStatus/{id}")
    Call<MonitoringStatus> get(@Path("id") String id);

    @POST("monitoringStatus")
    Call<MonitoringStatus> create(@Body MonitoringStatus monitoringStatus);

    @PUT("monitoringStatus/{id}")
    Call<MonitoringStatus> update(@Path("id") String id, @Body MonitoringStatus monitoringStatus);

    @DELETE("monitoringStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
