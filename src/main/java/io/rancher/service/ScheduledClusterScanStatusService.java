package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ScheduledClusterScanStatus;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ScheduledClusterScanStatusService {

    @GET("scheduledClusterScanStatus")
    Call<TypeCollection<ScheduledClusterScanStatus>> list();

    @GET("scheduledClusterScanStatus")
    Call<TypeCollection<ScheduledClusterScanStatus>> list(@QueryMap Filters filters);

    @GET("scheduledClusterScanStatus/{id}")
    Call<ScheduledClusterScanStatus> get(@Path("id") String id);

    @POST("scheduledClusterScanStatus")
    Call<ScheduledClusterScanStatus> create(@Body ScheduledClusterScanStatus scheduledClusterScanStatus);

    @PUT("scheduledClusterScanStatus/{id}")
    Call<ScheduledClusterScanStatus> update(@Path("id") String id, @Body ScheduledClusterScanStatus scheduledClusterScanStatus);

    @DELETE("scheduledClusterScanStatus/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
