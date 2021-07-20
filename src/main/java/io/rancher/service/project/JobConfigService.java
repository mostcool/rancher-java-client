package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.JobConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface JobConfigService {

    @GET("jobConfig")
    Call<TypeCollection<JobConfig>> list();

    @GET("jobConfig")
    Call<TypeCollection<JobConfig>> list(@QueryMap Filters filters);

    @GET("jobConfig/{id}")
    Call<JobConfig> get(@Path("id") String id);

    @POST("jobConfig")
    Call<JobConfig> create(@Body JobConfig jobConfig);

    @PUT("jobConfig/{id}")
    Call<JobConfig> update(@Path("id") String id, @Body JobConfig jobConfig);

    @DELETE("jobConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
