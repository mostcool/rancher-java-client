package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketServerPipelineConfig;
import io.rancher.type.project.BitbucketServerRequestLoginInput;
import io.rancher.type.project.BitbucketServerRequestLoginOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BitbucketServerPipelineConfigService {

    @GET("bitbucketServerPipelineConfig")
    Call<TypeCollection<BitbucketServerPipelineConfig>> list();

    @GET("bitbucketServerPipelineConfig")
    Call<TypeCollection<BitbucketServerPipelineConfig>> list(@QueryMap Filters filters);

    @GET("bitbucketServerPipelineConfig/{id}")
    Call<BitbucketServerPipelineConfig> get(@Path("id") String id);

    @POST("bitbucketServerPipelineConfig")
    Call<BitbucketServerPipelineConfig> create(@Body BitbucketServerPipelineConfig bitbucketServerPipelineConfig);

    @PUT("bitbucketServerPipelineConfig/{id}")
    Call<BitbucketServerPipelineConfig> update(@Path("id") String id, @Body BitbucketServerPipelineConfig bitbucketServerPipelineConfig);

    @DELETE("bitbucketServerPipelineConfig/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("bitbucketServerPipelineConfig/{id}?action=requestLogin")
    Call<BitbucketServerRequestLoginOutput> requestLogin(@Path("id") String id, @Body BitbucketServerRequestLoginInput bitbucketServerRequestLoginInput);
}
