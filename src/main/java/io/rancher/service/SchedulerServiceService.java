package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.SchedulerService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface SchedulerServiceService {

    @GET("schedulerService")
    Call<TypeCollection<SchedulerService>> list();

    @GET("schedulerService")
    Call<TypeCollection<SchedulerService>> list(@QueryMap Filters filters);

    @GET("schedulerService/{id}")
    Call<SchedulerService> get(@Path("id") String id);

    @POST("schedulerService")
    Call<SchedulerService> create(@Body SchedulerService schedulerService);

    @PUT("schedulerService/{id}")
    Call<SchedulerService> update(@Path("id") String id, @Body SchedulerService schedulerService);

    @DELETE("schedulerService/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
