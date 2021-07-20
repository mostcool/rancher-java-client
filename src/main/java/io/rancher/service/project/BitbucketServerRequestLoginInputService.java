package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.BitbucketServerRequestLoginInput;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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
    Call<Response> delete(@Path("id") String id);
    
}
