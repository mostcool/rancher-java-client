package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MonitoringOutput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface MonitoringOutputService {

    @GET("monitoringOutput")
    Call<TypeCollection<MonitoringOutput>> list();

    @GET("monitoringOutput")
    Call<TypeCollection<MonitoringOutput>> list(@QueryMap Filters filters);

    @GET("monitoringOutput/{id}")
    Call<MonitoringOutput> get(@Path("id") String id);

    @POST("monitoringOutput")
    Call<MonitoringOutput> create(@Body MonitoringOutput monitoringOutput);

    @PUT("monitoringOutput/{id}")
    Call<MonitoringOutput> update(@Path("id") String id, @Body MonitoringOutput monitoringOutput);

    @DELETE("monitoringOutput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
