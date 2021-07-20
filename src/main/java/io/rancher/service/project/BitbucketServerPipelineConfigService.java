package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketServerPipelineConfig;
import io.rancher.type.project.BitbucketServerRequestLoginInput;
import io.rancher.type.project.BitbucketServerRequestLoginOutput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
    @POST("bitbucketServerPipelineConfig/{id}?action=requestLogin")
    Call<BitbucketServerRequestLoginOutput> requestLogin(@Path("id") String id, @Body BitbucketServerRequestLoginInput bitbucketServerRequestLoginInput);
    
}
