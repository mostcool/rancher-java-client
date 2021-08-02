package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketCloudPipelineConfig;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

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
    Call<ResponseBody> delete(@Path("id") String id);
}
