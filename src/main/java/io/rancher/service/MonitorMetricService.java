package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MonitorMetric;
import retrofit2.Call;
import retrofit2.Response;
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
    Call<Response> delete(@Path("id") String id);
    
}
