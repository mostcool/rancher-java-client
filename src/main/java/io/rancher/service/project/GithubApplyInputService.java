package io.rancher.service.project;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.project.GithubApplyInput;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

public interface GithubApplyInputService {

    @GET("githubApplyInput")
    Call<TypeCollection<GithubApplyInput>> list();

    @GET("githubApplyInput")
    Call<TypeCollection<GithubApplyInput>> list(@QueryMap Filters filters);

    @GET("githubApplyInput/{id}")
    Call<GithubApplyInput> get(@Path("id") String id);

    @POST("githubApplyInput")
    Call<GithubApplyInput> create(@Body GithubApplyInput githubApplyInput);

    @PUT("githubApplyInput/{id}")
    Call<GithubApplyInput> update(@Path("id") String id, @Body GithubApplyInput githubApplyInput);

    @DELETE("githubApplyInput/{id}")
    Call<Response> delete(@Path("id") String id);
    
}
