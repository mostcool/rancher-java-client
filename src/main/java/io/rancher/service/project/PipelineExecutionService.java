package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PipelineExecution;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PipelineExecutionService {

    @GET("pipelineExecution")
    Call<TypeCollection<PipelineExecution>> list();

    @GET("pipelineExecution")
    Call<TypeCollection<PipelineExecution>> list(@QueryMap Filters filters);

    @GET("pipelineExecution/{id}")
    Call<PipelineExecution> get(@Path("id") String id);

    @POST("pipelineExecution")
    Call<PipelineExecution> create(@Body PipelineExecution pipelineExecution);

    @PUT("pipelineExecution/{id}")
    Call<PipelineExecution> update(@Path("id") String id, @Body PipelineExecution pipelineExecution);

    @DELETE("pipelineExecution/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
