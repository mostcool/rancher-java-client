package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CronJobStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface CronJobStatusService {

    @GET("cronJobStatus")
    Call<TypeCollection<CronJobStatus>> list();

    @GET("cronJobStatus")
    Call<TypeCollection<CronJobStatus>> list(@QueryMap Filters filters);

    @GET("cronJobStatus/{id}")
    Call<CronJobStatus> get(@Path("id") String id);

    @POST("cronJobStatus")
    Call<CronJobStatus> create(@Body CronJobStatus cronJobStatus);

    @PUT("cronJobStatus/{id}")
    Call<CronJobStatus> update(@Path("id") String id, @Body CronJobStatus cronJobStatus);

    @DELETE("cronJobStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
