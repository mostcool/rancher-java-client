package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.AuthUserInput;
import io.rancher.type.project.BitbucketServerProvider;
import io.rancher.type.project.BitbucketServerRequestLoginOutput;
import io.rancher.type.project.SourceCodeCredential;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BitbucketServerProviderService {

    @GET("bitbucketServerProvider")
    Call<TypeCollection<BitbucketServerProvider>> list();

    @GET("bitbucketServerProvider")
    Call<TypeCollection<BitbucketServerProvider>> list(@QueryMap Filters filters);

    @GET("bitbucketServerProvider/{id}")
    Call<BitbucketServerProvider> get(@Path("id") String id);

    @POST("bitbucketServerProvider")
    Call<BitbucketServerProvider> create(@Body BitbucketServerProvider bitbucketServerProvider);

    @PUT("bitbucketServerProvider/{id}")
    Call<BitbucketServerProvider> update(@Path("id") String id, @Body BitbucketServerProvider bitbucketServerProvider);

    @DELETE("bitbucketServerProvider/{id}")
    Call<ResponseBody> delete(@Path("id") String id);

    @POST("bitbucketServerProvider/{id}?action=login")
    Call<SourceCodeCredential> login(@Path("id") String id, @Body AuthUserInput authUserInput);

    @POST("bitbucketServerProvider/{id}?action=requestLogin")
    Call<BitbucketServerRequestLoginOutput> requestLogin(@Path("id") String id);
}
