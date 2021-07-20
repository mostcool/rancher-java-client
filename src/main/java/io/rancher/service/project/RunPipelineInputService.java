package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.RunPipelineInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface RunPipelineInputService {

    @GET("runPipelineInput")
    Call<TypeCollection<RunPipelineInput>> list();

    @GET("runPipelineInput")
    Call<TypeCollection<RunPipelineInput>> list(@QueryMap Filters filters);

    @GET("runPipelineInput/{id}")
    Call<RunPipelineInput> get(@Path("id") String id);

    @POST("runPipelineInput")
    Call<RunPipelineInput> create(@Body RunPipelineInput runPipelineInput);

    @PUT("runPipelineInput/{id}")
    Call<RunPipelineInput> update(@Path("id") String id, @Body RunPipelineInput runPipelineInput);

    @DELETE("runPipelineInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
