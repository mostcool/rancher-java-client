package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketServerRequestLoginInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface BitbucketServerRequestLoginInputService {

    @GET("bitbucketServerRequestLoginInput")
    Call<TypeCollection<BitbucketServerRequestLoginInput>> list();

    @GET("bitbucketServerRequestLoginInput")
    Call<TypeCollection<BitbucketServerRequestLoginInput>> list(@QueryMap Filters filters);

    @GET("bitbucketServerRequestLoginInput/{id}")
    Call<BitbucketServerRequestLoginInput> get(@Path("id") String id);

    @POST("bitbucketServerRequestLoginInput")
    Call<BitbucketServerRequestLoginInput> create(@Body BitbucketServerRequestLoginInput bitbucketServerRequestLoginInput);

    @PUT("bitbucketServerRequestLoginInput/{id}")
    Call<BitbucketServerRequestLoginInput> update(@Path("id") String id, @Body BitbucketServerRequestLoginInput bitbucketServerRequestLoginInput);

    @DELETE("bitbucketServerRequestLoginInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
