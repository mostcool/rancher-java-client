package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.GithubConfigTestOutput;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface GithubConfigTestOutputService {

    @GET("githubConfigTestOutput")
    Call<TypeCollection<GithubConfigTestOutput>> list();

    @GET("githubConfigTestOutput")
    Call<TypeCollection<GithubConfigTestOutput>> list(@QueryMap Filters filters);

    @GET("githubConfigTestOutput/{id}")
    Call<GithubConfigTestOutput> get(@Path("id") String id);

    @POST("githubConfigTestOutput")
    Call<GithubConfigTestOutput> create(@Body GithubConfigTestOutput githubConfigTestOutput);

    @PUT("githubConfigTestOutput/{id}")
    Call<GithubConfigTestOutput> update(@Path("id") String id, @Body GithubConfigTestOutput githubConfigTestOutput);

    @DELETE("githubConfigTestOutput/{id}")
    Call<ResponseBody> delete(@Path("id") String id);
}
