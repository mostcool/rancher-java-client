package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.JobStatus;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface JobStatusService {

    @GET("jobStatus")
    Call<TypeCollection<JobStatus>> list();

    @GET("jobStatus")
    Call<TypeCollection<JobStatus>> list(@QueryMap Filters filters);

    @GET("jobStatus/{id}")
    Call<JobStatus> get(@Path("id") String id);

    @POST("jobStatus")
    Call<JobStatus> create(@Body JobStatus jobStatus);

    @PUT("jobStatus/{id}")
    Call<JobStatus> update(@Path("id") String id, @Body JobStatus jobStatus);

    @DELETE("jobStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
