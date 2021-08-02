package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.ServiceMonitor;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceMonitorService {

    @GET("serviceMonitor")
    Call<TypeCollection<ServiceMonitor>> list();

    @GET("serviceMonitor")
    Call<TypeCollection<ServiceMonitor>> list(@QueryMap Filters filters);

    @GET("serviceMonitor/{id}")
    Call<ServiceMonitor> get(@Path("id") String id);

    @POST("serviceMonitor")
    Call<ServiceMonitor> create(@Body ServiceMonitor serviceMonitor);

    @PUT("serviceMonitor/{id}")
    Call<ServiceMonitor> update(@Path("id") String id, @Body ServiceMonitor serviceMonitor);

    @DELETE("serviceMonitor/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
