package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AuthUserInput;
import io.rancher.type.project.BitbucketCloudProvider;
import io.rancher.type.project.SourceCodeCredential;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BitbucketCloudProviderService {

    @GET("bitbucketCloudProvider")
    Call<TypeCollection<BitbucketCloudProvider>> list();

    @GET("bitbucketCloudProvider")
    Call<TypeCollection<BitbucketCloudProvider>> list(@QueryMap Filters filters);

    @GET("bitbucketCloudProvider/{id}")
    Call<BitbucketCloudProvider> get(@Path("id") String id);

    @POST("bitbucketCloudProvider")
    Call<BitbucketCloudProvider> create(@Body BitbucketCloudProvider bitbucketCloudProvider);

    @PUT("bitbucketCloudProvider/{id}")
    Call<BitbucketCloudProvider> update(@Path("id") String id, @Body BitbucketCloudProvider bitbucketCloudProvider);

    @DELETE("bitbucketCloudProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("bitbucketCloudProvider/{id}?action=login")
    Call<SourceCodeCredential> login(@Path("id") String id, @Body AuthUserInput authUserInput);
}
