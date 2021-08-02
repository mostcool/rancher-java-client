package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.CronJobConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CronJobConfigService {

    @GET("cronJobConfig")
    Call<TypeCollection<CronJobConfig>> list();

    @GET("cronJobConfig")
    Call<TypeCollection<CronJobConfig>> list(@QueryMap Filters filters);

    @GET("cronJobConfig/{id}")
    Call<CronJobConfig> get(@Path("id") String id);

    @POST("cronJobConfig")
    Call<CronJobConfig> create(@Body CronJobConfig cronJobConfig);

    @PUT("cronJobConfig/{id}")
    Call<CronJobConfig> update(@Path("id") String id, @Body CronJobConfig cronJobConfig);

    @DELETE("cronJobConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
