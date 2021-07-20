package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.StepStatus;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface StepStatusService {

    @GET("stepStatus")
    Call<TypeCollection<StepStatus>> list();

    @GET("stepStatus")
    Call<TypeCollection<StepStatus>> list(@QueryMap Filters filters);

    @GET("stepStatus/{id}")
    Call<StepStatus> get(@Path("id") String id);

    @POST("stepStatus")
    Call<StepStatus> create(@Body StepStatus stepStatus);

    @PUT("stepStatus/{id}")
    Call<StepStatus> update(@Path("id") String id, @Body StepStatus stepStatus);

    @DELETE("stepStatus/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
