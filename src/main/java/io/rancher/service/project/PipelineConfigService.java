package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.PipelineConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface PipelineConfigService {

    @GET("pipelineConfig")
    Call<TypeCollection<PipelineConfig>> list();

    @GET("pipelineConfig")
    Call<TypeCollection<PipelineConfig>> list(@QueryMap Filters filters);

    @GET("pipelineConfig/{id}")
    Call<PipelineConfig> get(@Path("id") String id);

    @POST("pipelineConfig")
    Call<PipelineConfig> create(@Body PipelineConfig pipelineConfig);

    @PUT("pipelineConfig/{id}")
    Call<PipelineConfig> update(@Path("id") String id, @Body PipelineConfig pipelineConfig);

    @DELETE("pipelineConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
