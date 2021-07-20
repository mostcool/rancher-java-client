package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.Job;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface JobService {

    @GET("job")
    Call<TypeCollection<Job>> list();

    @GET("job")
    Call<TypeCollection<Job>> list(@QueryMap Filters filters);

    @GET("job/{id}")
    Call<Job> get(@Path("id") String id);

    @POST("job")
    Call<Job> create(@Body Job job);

    @PUT("job/{id}")
    Call<Job> update(@Path("id") String id, @Body Job job);

    @DELETE("job/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
