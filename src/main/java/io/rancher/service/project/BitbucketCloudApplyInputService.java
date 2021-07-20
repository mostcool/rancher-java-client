package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketCloudApplyInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface BitbucketCloudApplyInputService {

    @GET("bitbucketCloudApplyInput")
    Call<TypeCollection<BitbucketCloudApplyInput>> list();

    @GET("bitbucketCloudApplyInput")
    Call<TypeCollection<BitbucketCloudApplyInput>> list(@QueryMap Filters filters);

    @GET("bitbucketCloudApplyInput/{id}")
    Call<BitbucketCloudApplyInput> get(@Path("id") String id);

    @POST("bitbucketCloudApplyInput")
    Call<BitbucketCloudApplyInput> create(@Body BitbucketCloudApplyInput bitbucketCloudApplyInput);

    @PUT("bitbucketCloudApplyInput/{id}")
    Call<BitbucketCloudApplyInput> update(@Path("id") String id, @Body BitbucketCloudApplyInput bitbucketCloudApplyInput);

    @DELETE("bitbucketCloudApplyInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
