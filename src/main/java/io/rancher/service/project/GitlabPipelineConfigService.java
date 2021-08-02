package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.GitlabPipelineConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GitlabPipelineConfigService {

    @GET("gitlabPipelineConfig")
    Call<TypeCollection<GitlabPipelineConfig>> list();

    @GET("gitlabPipelineConfig")
    Call<TypeCollection<GitlabPipelineConfig>> list(@QueryMap Filters filters);

    @GET("gitlabPipelineConfig/{id}")
    Call<GitlabPipelineConfig> get(@Path("id") String id);

    @POST("gitlabPipelineConfig")
    Call<GitlabPipelineConfig> create(@Body GitlabPipelineConfig gitlabPipelineConfig);

    @PUT("gitlabPipelineConfig/{id}")
    Call<GitlabPipelineConfig> update(@Path("id") String id, @Body GitlabPipelineConfig gitlabPipelineConfig);

    @DELETE("gitlabPipelineConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
