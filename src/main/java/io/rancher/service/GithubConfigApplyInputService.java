package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GithubConfigApplyInput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GithubConfigApplyInputService {

    @GET("githubConfigApplyInput")
    Call<TypeCollection<GithubConfigApplyInput>> list();

    @GET("githubConfigApplyInput")
    Call<TypeCollection<GithubConfigApplyInput>> list(@QueryMap Filters filters);

    @GET("githubConfigApplyInput/{id}")
    Call<GithubConfigApplyInput> get(@Path("id") String id);

    @POST("githubConfigApplyInput")
    Call<GithubConfigApplyInput> create(@Body GithubConfigApplyInput githubConfigApplyInput);

    @PUT("githubConfigApplyInput/{id}")
    Call<GithubConfigApplyInput> update(@Path("id") String id, @Body GithubConfigApplyInput githubConfigApplyInput);

    @DELETE("githubConfigApplyInput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
