package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PipelineSetting;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PipelineSettingService {

    @GET("pipelineSetting")
    Call<TypeCollection<PipelineSetting>> list();

    @GET("pipelineSetting")
    Call<TypeCollection<PipelineSetting>> list(@QueryMap Filters filters);

    @GET("pipelineSetting/{id}")
    Call<PipelineSetting> get(@Path("id") String id);

    @POST("pipelineSetting")
    Call<PipelineSetting> create(@Body PipelineSetting pipelineSetting);

    @PUT("pipelineSetting/{id}")
    Call<PipelineSetting> update(@Path("id") String id, @Body PipelineSetting pipelineSetting);

    @DELETE("pipelineSetting/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
