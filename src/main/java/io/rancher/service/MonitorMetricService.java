package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MonitorMetric;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MonitorMetricService {

    @GET("monitorMetric")
    Call<TypeCollection<MonitorMetric>> list();

    @GET("monitorMetric")
    Call<TypeCollection<MonitorMetric>> list(@QueryMap Filters filters);

    @GET("monitorMetric/{id}")
    Call<MonitorMetric> get(@Path("id") String id);

    @POST("monitorMetric")
    Call<MonitorMetric> create(@Body MonitorMetric monitorMetric);

    @PUT("monitorMetric/{id}")
    Call<MonitorMetric> update(@Path("id") String id, @Body MonitorMetric monitorMetric);

    @DELETE("monitorMetric/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
