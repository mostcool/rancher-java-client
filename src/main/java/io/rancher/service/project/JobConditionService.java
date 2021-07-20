package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.JobCondition;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface JobConditionService {

    @GET("jobCondition")
    Call<TypeCollection<JobCondition>> list();

    @GET("jobCondition")
    Call<TypeCollection<JobCondition>> list(@QueryMap Filters filters);

    @GET("jobCondition/{id}")
    Call<JobCondition> get(@Path("id") String id);

    @POST("jobCondition")
    Call<JobCondition> create(@Body JobCondition jobCondition);

    @PUT("jobCondition/{id}")
    Call<JobCondition> update(@Path("id") String id, @Body JobCondition jobCondition);

    @DELETE("jobCondition/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
