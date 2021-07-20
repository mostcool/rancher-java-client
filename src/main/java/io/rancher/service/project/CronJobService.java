package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CronJob;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface CronJobService {

    @GET("cronJob")
    Call<TypeCollection<CronJob>> list();

    @GET("cronJob")
    Call<TypeCollection<CronJob>> list(@QueryMap Filters filters);

    @GET("cronJob/{id}")
    Call<CronJob> get(@Path("id") String id);

    @POST("cronJob")
    Call<CronJob> create(@Body CronJob cronJob);

    @PUT("cronJob/{id}")
    Call<CronJob> update(@Path("id") String id, @Body CronJob cronJob);

    @DELETE("cronJob/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
