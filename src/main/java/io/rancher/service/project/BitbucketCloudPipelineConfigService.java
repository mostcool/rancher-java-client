package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketCloudPipelineConfig;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BitbucketCloudPipelineConfigService {

    @GET("bitbucketCloudPipelineConfig")
    Call<TypeCollection<BitbucketCloudPipelineConfig>> list();

    @GET("bitbucketCloudPipelineConfig")
    Call<TypeCollection<BitbucketCloudPipelineConfig>> list(@QueryMap Filters filters);

    @GET("bitbucketCloudPipelineConfig/{id}")
    Call<BitbucketCloudPipelineConfig> get(@Path("id") String id);

    @POST("bitbucketCloudPipelineConfig")
    Call<BitbucketCloudPipelineConfig> create(@Body BitbucketCloudPipelineConfig bitbucketCloudPipelineConfig);

    @PUT("bitbucketCloudPipelineConfig/{id}")
    Call<BitbucketCloudPipelineConfig> update(@Path("id") String id, @Body BitbucketCloudPipelineConfig bitbucketCloudPipelineConfig);

    @DELETE("bitbucketCloudPipelineConfig/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
