package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.GithubPipelineConfig;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GithubPipelineConfigService {

    @GET("githubPipelineConfig")
    Call<TypeCollection<GithubPipelineConfig>> list();

    @GET("githubPipelineConfig")
    Call<TypeCollection<GithubPipelineConfig>> list(@QueryMap Filters filters);

    @GET("githubPipelineConfig/{id}")
    Call<GithubPipelineConfig> get(@Path("id") String id);

    @POST("githubPipelineConfig")
    Call<GithubPipelineConfig> create(@Body GithubPipelineConfig githubPipelineConfig);

    @PUT("githubPipelineConfig/{id}")
    Call<GithubPipelineConfig> update(@Path("id") String id, @Body GithubPipelineConfig githubPipelineConfig);

    @DELETE("githubPipelineConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
