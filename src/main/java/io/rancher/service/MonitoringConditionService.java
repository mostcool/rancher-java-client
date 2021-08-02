package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.MonitoringCondition;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface MonitoringConditionService {

    @GET("monitoringCondition")
    Call<TypeCollection<MonitoringCondition>> list();

    @GET("monitoringCondition")
    Call<TypeCollection<MonitoringCondition>> list(@QueryMap Filters filters);

    @GET("monitoringCondition/{id}")
    Call<MonitoringCondition> get(@Path("id") String id);

    @POST("monitoringCondition")
    Call<MonitoringCondition> create(@Body MonitoringCondition monitoringCondition);

    @PUT("monitoringCondition/{id}")
    Call<MonitoringCondition> update(@Path("id") String id, @Body MonitoringCondition monitoringCondition);

    @DELETE("monitoringCondition/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
