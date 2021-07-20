package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PushPipelineConfigInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface PushPipelineConfigInputService {

    @GET("pushPipelineConfigInput")
    Call<TypeCollection<PushPipelineConfigInput>> list();

    @GET("pushPipelineConfigInput")
    Call<TypeCollection<PushPipelineConfigInput>> list(@QueryMap Filters filters);

    @GET("pushPipelineConfigInput/{id}")
    Call<PushPipelineConfigInput> get(@Path("id") String id);

    @POST("pushPipelineConfigInput")
    Call<PushPipelineConfigInput> create(@Body PushPipelineConfigInput pushPipelineConfigInput);

    @PUT("pushPipelineConfigInput/{id}")
    Call<PushPipelineConfigInput> update(@Path("id") String id, @Body PushPipelineConfigInput pushPipelineConfigInput);

    @DELETE("pushPipelineConfigInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
