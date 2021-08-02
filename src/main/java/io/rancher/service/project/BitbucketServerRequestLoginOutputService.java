package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketServerRequestLoginOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BitbucketServerRequestLoginOutputService {

    @GET("bitbucketServerRequestLoginOutput")
    Call<TypeCollection<BitbucketServerRequestLoginOutput>> list();

    @GET("bitbucketServerRequestLoginOutput")
    Call<TypeCollection<BitbucketServerRequestLoginOutput>> list(@QueryMap Filters filters);

    @GET("bitbucketServerRequestLoginOutput/{id}")
    Call<BitbucketServerRequestLoginOutput> get(@Path("id") String id);

    @POST("bitbucketServerRequestLoginOutput")
    Call<BitbucketServerRequestLoginOutput> create(@Body BitbucketServerRequestLoginOutput bitbucketServerRequestLoginOutput);

    @PUT("bitbucketServerRequestLoginOutput/{id}")
    Call<BitbucketServerRequestLoginOutput> update(@Path("id") String id, @Body BitbucketServerRequestLoginOutput bitbucketServerRequestLoginOutput);

    @DELETE("bitbucketServerRequestLoginOutput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
